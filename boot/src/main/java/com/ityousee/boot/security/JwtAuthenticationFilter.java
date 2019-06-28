package com.ityousee.boot.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 登陆过后的所有请求都会经过该过滤器，判断token是否有效，如果有效则将从token中解析的用户信息（自定义的User，实现了UserDetail）、权限、角色 解析出来并设置到SecurityContextHolder中
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {


    protected String getJwtToken(HttpServletRequest request) {
        String authInfo = request.getHeader("Authorization");
        return authInfo;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("Authentication");
        if (token==null || token.isEmpty()){
            filterChain.doFilter(request,response);
            return;
        }
        Authentication authResult = null;
        AuthenticationException failed = null;
//        String token = getJwtToken(request);
        User user;
        try {
            String claims = JwtTokenUtils.decode(token);
            user = JSON.parseObject(claims, User.class);
            if (Duration.between(user.getIssTime(), LocalDateTime.now()).toMillis() >= user.getExpriTime()*1000){
                throw new AccountExpiredException("User account has expired");
            }
        }catch (AccountExpiredException e){
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("token expired");
            return;
        } catch (Exception e){
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("token invaluable");
            return;
        }

        JwtToken jwtLoginToken = new JwtToken(user, "", user.getAuthorities());
        jwtLoginToken.setDetails(new WebAuthenticationDetails(request));
        SecurityContextHolder.getContext().setAuthentication(jwtLoginToken);
        filterChain.doFilter(request,response);

    }
}
