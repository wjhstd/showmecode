package com.ityousee.boot.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 自定义UserDetailsService
 */
@Component
@Slf4j
public class UserService implements UserDetailsService
{
    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        if (s.equals("admin")){
            // 这里没有查询数据库，而是直接返回了用户对象，第三个参数是角色或者权限，如果是角色的话必须要以ROLE_ 开头
            User user = new User("admin", "$2a$10$1MqZK91QHiMnqOOxSJMU1OTedeRJKPoMqU4Kav8fuf4mikjgzoKYy","ROLE_ADMIN");
            log.info(user.toString());
            return user;
        }else if (s.equals("guest")){
            User user = new User("guest", "$2a$10$1MqZK91QHiMnqOOxSJMU1OTedeRJKPoMqU4Kav8fuf4mikjgzoKYy","user:list");
            return user;
        }
        return null;
    }
}
