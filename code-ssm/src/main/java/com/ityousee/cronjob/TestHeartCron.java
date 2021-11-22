package com.ityousee.cronjob;

import org.springframework.stereotype.Component;

@Component
public class TestHeartCron {



//    @Scheduled(fixedRate = 2000)
//    public void rolestatus() {
//        new Thread(()->{
//            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/device/role?storageRole=2&serviceRole=2&andesPort=7000", "ROLE_STATUS", RequestMethod.GET, ContentType.APPLICATION_JSON);
//        }).start();
//    }
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
