package com.ityousee.cronjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestHeartCron {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(fixedRate = 5000)
    public void rolestatus() {
    
        logger.info(">>>>>>>>>>>>>>>>> " + Thread.currentThread().getName() + "> 心跳" + "> " + new Date());
    }
//    @Scheduled(fixedRate = 2000)
//    public void recoverspeed() {
//
//        Gson gson = new Gson();
////        new Thread(()->{
//            Map map = new HashMap<>();
//            map.put("port", 7000);
//            map.put("op", "speed");
//            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/blockPool/recover/speed", "RECOVER", RequestMethod.POST, ContentType.APPLICATION_JSON, gson.toJson(map));
////        }).start();
//    }
//    @Scheduled(fixedRate = 2000)
//    public void recoverspeed2() {
//
//        Gson gson = new Gson();
////        new Thread(()->{
//        Map map = new HashMap<>();
//        map.put("port", 7000);
//        map.put("op", "speed");
//        RestClient.commandAgent("192.168.113.130", "8063", "/em/command/blockPool/recover/speed", "RECOVER", RequestMethod.POST, ContentType.APPLICATION_JSON, gson.toJson(map));
////        }).start();
//    }
//    @Scheduled(fixedRate = 2000)
//    public void performance() {
////        new Thread(()->{
//            RestClient.commandAgent("192.168.113.130", "8063", "/em/command//device/performance", "PERFORMANCE", RequestMethod.GET, ContentType.APPLICATION_JSON);
////        }).start();
//    }
//    @Scheduled(fixedRate = 2000)
//    public void emHeartbeat() {
////        new Thread(()->{
//            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/heartbeat", "HEARTBEAT_CHECK", RequestMethod.GET, ContentType.APPLICATION_JSON);
////        }).start();
//    }
}
