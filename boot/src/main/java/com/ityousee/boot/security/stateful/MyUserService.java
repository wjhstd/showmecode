package com.ityousee.boot.security.stateful;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MyUserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List list = new ArrayList();
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority("user:list");
                list.add(authority);
                return list;
            }

            @Override
            public String getPassword() {
                return "$2a$10$j.arEBpvO/HyceiY7v3EW.uFd1wdt0CQGV.G/UZdglqKBM.hL7F.m";
            }

            @Override
            public String getUsername() {
                return "admin";
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };
        return user;
    }
}
