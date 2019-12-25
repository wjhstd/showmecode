package com.ityousee.boot;

import com.ityousee.boot.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisTemplate {
    @Autowired
    RedisUtil redisUtil;
    @Test
    public  void test() {
        redisUtil.set("18137477955","junhui");
    }

}
