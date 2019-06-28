package com.ityousee.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginAuthenticationProvider loginAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter();
        http
                .authorizeRequests().antMatchers("/resources/**").permitAll()
                .and().authorizeRequests().anyRequest().authenticated()
                .and()
                //权限不足时的处理
                .exceptionHandling()
                .accessDeniedHandler(new MyAccessDenyHandler())
                .authenticationEntryPoint(new MyAuthenticationEntryPoint())
                .and()
                .addFilterBefore(loginFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterAfter(jwtAuthenticationFilter, JwtLoginFilter.class)
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
        auth.authenticationProvider(loginAuthenticationProvider);
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
}
