package com.ityousee.boot.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证成功后生成token并返回（token中包含了用户的信息以及角色权限等）
 */
public class AuthcateSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication auth) throws IOException, ServletException {
//        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
//        // 定义存放角色集合的对象
//        List roleList = new ArrayList<>();
//        for (GrantedAuthority grantedAuthority : authorities) {
//            roleList.add(grantedAuthority.getAuthority());
//        }
        String userJsonStr = JSON.toJSONString(auth.getPrincipal());
        //认证成功后，生成token，token包含
        String token = JwtTokenUtils.encode(userJsonStr);
        httpServletResponse.setHeader("Authorization", token);
    }
}
