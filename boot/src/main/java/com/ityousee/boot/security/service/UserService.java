package com.ityousee.boot.security.service;

import com.ityousee.boot.mapper.SysUserMapper;
import com.ityousee.boot.model.SysUser;
import com.ityousee.boot.security.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private SysUserMapper sysUserMapper;

    public CommonResponse addUser(SysUser user){
        CommonResponse res = new CommonResponse();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        sysUserMapper.insertSelective(user);
        return res;
    }
}
