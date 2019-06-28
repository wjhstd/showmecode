package com.ityousee.boot.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter {
    JwtLoginFilter() {
        super((new AntPathRequestMatcher("/jwtlogin", "GET")));
    }

    /**
     * 获取到用户名密码，跟数据库中的进行比对
     * @param request
     * @param response
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("passWord");
        //创建未认证的凭证(etAuthenticated(false)),注意此时凭证中的主体principal为用户名
        JwtToken jwtToken = new JwtToken(userName, password);
        jwtToken.setDetails(new WebAuthenticationDetails(request));
        Authentication authenticatedToken = this.getAuthenticationManager().authenticate(jwtToken);
        return authenticatedToken;

    }



}
