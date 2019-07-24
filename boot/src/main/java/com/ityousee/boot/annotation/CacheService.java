package com.ityousee.boot.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CacheService {
    @Pointcut(value = "@annotation(com.ityousee.boot.annotation.MyCache)")
    public void pointCut(){}
    @Before(value = "pointCut() && @annotation(cacheRedis)")
    public void before(MyCache cacheRedis) {
        log.info("the result of this method will be cached.");
    }

    @AfterReturning(value = "pointCut() && @annotation(cacheRedis)",returning = "result")
    public void after(MyCache cacheRedis,Object result) {
        String key = cacheRedis.key();
        int expireTime = cacheRedis.expiretime();
        //do something...
        log.info("-----redis-----[key = " + key + "]"+"[expireTime = " + expireTime + "]");
        log.info("the result of this method is" + result + ",and has been cached.");
    }

}
