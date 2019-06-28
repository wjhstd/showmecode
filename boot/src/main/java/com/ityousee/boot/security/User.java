package com.ityousee.boot.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class User implements UserDetails {
    private String userName;
    private String passWord;
    private LocalDateTime issTime;
    private Long expriTime;
    private List<SimpleGrantedAuthority> authorities;

    public User(String username, String password, String ... roles){
        this.userName = username;
        this.passWord = password;
        this.authorities= Arrays.stream(roles).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    public User() {
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
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



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setAuthorities(List<SimpleGrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public LocalDateTime getIssTime() {
        return issTime;
    }

    public void setIssTime(LocalDateTime issTime) {
        this.issTime = issTime;
    }

    public Long getExpriTime() {
        return expriTime;
    }

    public void setExpriTime(Long expriTime) {
        this.expriTime = expriTime;
    }
}
