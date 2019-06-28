package com.ityousee.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 登陆时的认证就是在这里完成的
 */
@Component
public class LoginAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName= authentication.getName();
        //获取用户
        User userDetails = userService.loadUserByUsername(userName);
        // TODO: 2019/6/28 token超时或者未超时需要刷新token
        userDetails.setIssTime(LocalDateTime.now());
        userDetails.setExpriTime(1800L);
        //转换authentication 认证时会先调用support方法,受支持才会调用,所以能强转
        JwtToken jwtLoginToken= (JwtToken) authentication;
        //检查
        defaultCheck(userDetails);
        additionalAuthenticationChecks(userDetails,jwtLoginToken);

        //检查完如果没有抛出异常代表验证通过
        JwtToken authenticatedToken = new JwtToken(userDetails, jwtLoginToken.getCredentials(), userDetails.getAuthorities());
        authenticatedToken.setDetails(jwtLoginToken.getDetails());
        return authenticatedToken;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return (JwtToken.class
                .isAssignableFrom(aClass));
    }

    /**(附加检查项)检查密码是否正确*/
    private void additionalAuthenticationChecks(UserDetails userDetails,
                                                JwtToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null) {
            throw new BadCredentialsException("Bad credentials");
        }
        String presentedPassword = authentication.getCredentials().toString();

        if (!passwordEncoder.matches(presentedPassword, userDetails.getPassword())) {
            throw new BadCredentialsException("Bad credentials");
        }
    }

    /**用户默认检查,用户是否锁定过期等*/
    private void defaultCheck(UserDetails user) {
        if (!user.isAccountNonLocked()) {
            throw new LockedException("User account is locked");
        }

        if (!user.isEnabled()) {
            throw new DisabledException("User is disabled");
        }

        if (!user.isAccountNonExpired()) {
            throw new AccountExpiredException("User account has expired");
        }
    }
}
