package com.ityousee.boot.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;

    @PostMapping(value = "/testPush", produces
            = "application/json;charset=utf-8")
    public void testPush(@RequestBody String body) {
        /**
         * 使用redisTemplate的convertAndSend()函数，
         * String channel, Object message
         * channel代表管道，
         * message代表发送的信息
         */
        redisTemplate.convertAndSend("topic1", body);
    }

}
