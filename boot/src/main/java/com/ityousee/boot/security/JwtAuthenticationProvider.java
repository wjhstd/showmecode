package com.ityousee.boot.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * 暂时没有用到
 */
public class JwtAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
