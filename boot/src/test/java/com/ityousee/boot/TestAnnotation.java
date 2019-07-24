package com.ityousee.boot;

import com.ityousee.boot.annotation.CacheSerciceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnnotation {
    @Autowired
    private CacheSerciceImpl cacheSerciceImpl;
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void testCache(){
//        Map map = applicationContext.getBeansWithAnnotation(Service.class);
//        log.info(map.toString());
        cacheSerciceImpl.test(2);
    }
}
