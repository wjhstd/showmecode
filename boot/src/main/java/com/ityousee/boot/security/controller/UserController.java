package com.ityousee.boot.security.controller;

import com.ityousee.boot.model.SysUser;
import com.ityousee.boot.security.CommonResponse;
import com.ityousee.boot.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(method = RequestMethod.POST,  produces = "application/json; charset=UTF-8")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public CommonResponse addUser(@RequestBody SysUser sysUser){
        userServiceImpl.addUser(sysUser);
        CommonResponse response = new CommonResponse();
        response.setResult("success");
        return response;
    }
}
