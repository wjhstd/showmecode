package com.ityousee.boot.security;

import com.alibaba.fastjson.JSONObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 */
@RestController
@RequestMapping
public class UserTestController {
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('user:list') or hasRole('ROLE_ADMIN')")
    public JSONObject userList(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "guest");
        return jsonObject;
    }

    @RequestMapping(value = "/userAdd",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public JSONObject userAdd(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "admin");
        return jsonObject;
    }
}
