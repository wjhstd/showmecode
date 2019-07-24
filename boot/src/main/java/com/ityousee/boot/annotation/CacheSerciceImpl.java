package com.ityousee.boot.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CacheSerciceImpl {
    @MyCache(key="test", expiretime = 600)
    public int test(int i) {
        log.info("进入service方法");
        return 0;
    }
}
