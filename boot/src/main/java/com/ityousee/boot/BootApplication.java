package com.ityousee.boot;

import com.ityousee.boot.mapper.SysUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = "com.ityousee.boot.mapper")
public class BootApplication {

    @Autowired
    private SysUserMapper sysUserMapper;
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
