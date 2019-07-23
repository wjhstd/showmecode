package com.ityousee.cronjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TestCronExpection {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    spring scheduler底层使用的还是juc中的ScheduledExecutorService类。
//    默认情况下,所有的定时任务都是放在一个线程跑的。也就是说,如果这个线程执行某个任务崩溃了或者执行某个任务的时候卡住了，那其他的定时任务也就都无法执行了。
//    通过配置可以将单线程执行所有调度变成多线程执行所有调度任务。
//    由于spring使用javaScheduledExecutorService配置定时任务的时候对任务做了封装,所以即使执行的任务发生了我们没有捕获的异常，也不会导致线程崩溃。因此,导致spring scheduler定时任务全部停止的原因很可能是因为执行某个定时任务的时候卡住了。
    @Scheduled(cron = "0 * * * * ?")
    public void test(){
        logger.info("定时任务执行"+ LocalDateTime.now());
        try {
            Thread.sleep(1000*60*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
