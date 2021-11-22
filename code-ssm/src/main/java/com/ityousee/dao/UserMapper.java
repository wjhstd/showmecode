package com.ityousee.dao;

import com.ityousee.model.User;

/**
 *@ClassName: UserMapper
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/5/11 14:39
 **/


public interface UserMapper {
    User getAll();
    int insert(User user);
    int update(User user);
}
