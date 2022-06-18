package com.ityousee.boot.security;

import com.ityousee.boot.security.stateful.MyAuthcateSucessHandler;
import com.ityousee.boot.security.stateful.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
//@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Order(1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    @Autowired
    private MyUserService myUserService;

    @Autowired
    private LoginAuthenticationProvider loginAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter();
        http
//                .antMatcher("/api/**")
                .authorizeRequests().antMatchers("/resources/**").permitAll()
                .and().authorizeRequests().antMatchers("/testPush").permitAll()
                .and().authorizeRequests().anyRequest().authenticated()
                .and()
                //权限不足时的处理
                .exceptionHandling()
                .accessDeniedHandler(new MyAccessDenyHandler())
                .authenticationEntryPoint(new MyAuthenticationEntryPoint())
                .and()
                .formLogin()
//                .loginProcessingUrl("/login")
                .permitAll()
                .and()
                .addFilterAt(filter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(loginFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterAfter(jwtAuthenticationFilter, JwtLoginFilter.class)
                .csrf().disable();
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService);
        auth.authenticationProvider(loginAuthenticationProvider).userDetailsService(userService);
        auth.authenticationProvider(provider());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public JwtLoginFilter loginFilter() throws Exception{
        JwtLoginFilter jwtLoginFilter = new JwtLoginFilter();
        jwtLoginFilter.setAuthenticationManager(this.authenticationManager());
        //登录成功和失败的操作
        jwtLoginFilter.setAuthenticationSuccessHandler(new AuthcateSuccessHandler());
        jwtLoginFilter.setAuthenticationFailureHandler(new AuthcateFailHandler());
        return jwtLoginFilter;
    }

    @Bean
    public UsernamePasswordAuthenticationFilter filter(){
        UsernamePasswordAuthenticationFilter filter = new UsernamePasswordAuthenticationFilter();
        try {
            filter.setAuthenticationManager(this.authenticationManager());
            filter.setAuthenticationSuccessHandler(new MyAuthcateSucessHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return filter;
    }

    @Bean
    public AuthenticationProvider provider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(myUserService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

}
