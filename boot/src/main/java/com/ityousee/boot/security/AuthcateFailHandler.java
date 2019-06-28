package com.ityousee.boot.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 身份验证失败处理器
 */
public class AuthcateFailHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        Map<String , String> map = new HashMap<>();
        map.put("code", "401");
        map.put("msg", "验证失败");
        httpServletResponse.getWriter().write(JSON.toJSONString(map));
        httpServletResponse.getWriter().flush();
    }
}
