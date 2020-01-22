package com.ityousee.wxapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ityousee.wxapi.mapper") //设置mapper接口的扫描包
@SpringBootApplication
public class WxApiApplication {

    public static void main (String[] args) {
        SpringApplication.run(WxApiApplication.class, args);
    }

}
