package com.ityousee.boot.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆了，但是访问的资源没有权限时就会进到这个方法
 */
public class MyAccessDenyHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        Map<String , String> map = new HashMap<>();
        map.put("code", "403");
        map.put("msg", "您的权限不足，无法访问该资源");
        httpServletResponse.getWriter().write(JSON.toJSONString(map));
        httpServletResponse.getWriter().flush();
    }
}
