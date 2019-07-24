package com.ityousee.boot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationContext implements ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean 初始化完成之后");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
