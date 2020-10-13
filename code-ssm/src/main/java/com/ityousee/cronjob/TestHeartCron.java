package com.ityousee.cronjob;

import com.google.gson.Gson;
import com.ityousee.util.RestClient;
import org.apache.http.entity.ContentType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Component
public class TestHeartCron {
    
    
    
    @Scheduled(fixedRate = 2000)
    public void rolestatus() {
        new Thread(()->{
            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/device/role?storageRole=2&serviceRole=2&andesPort=7000", "ROLE_STATUS", RequestMethod.GET, ContentType.APPLICATION_JSON);
        }).start();
    }
    @Scheduled(fixedRate = 2000)
    public void recoverspeed() {
    
        Gson gson = new Gson();
//        new Thread(()->{
            Map map = new HashMap<>();
            map.put("port", 7000);
            map.put("op", "speed");
            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/blockPool/recover/speed", "RECOVER", RequestMethod.POST, ContentType.APPLICATION_JSON, gson.toJson(map));
//        }).start();
    }
    @Scheduled(fixedRate = 2000)
    public void recoverspeed2() {
        
        Gson gson = new Gson();
//        new Thread(()->{
        Map map = new HashMap<>();
        map.put("port", 7000);
        map.put("op", "speed");
        RestClient.commandAgent("192.168.113.130", "8063", "/em/command/blockPool/recover/speed", "RECOVER", RequestMethod.POST, ContentType.APPLICATION_JSON, gson.toJson(map));
//        }).start();
    }
    @Scheduled(fixedRate = 2000)
    public void performance() {
//        new Thread(()->{
            RestClient.commandAgent("192.168.113.130", "8063", "/em/command//device/performance", "PERFORMANCE", RequestMethod.GET, ContentType.APPLICATION_JSON);
//        }).start();
    }
    @Scheduled(fixedRate = 2000)
    public void emHeartbeat() {
//        new Thread(()->{
            RestClient.commandAgent("192.168.113.130", "8063", "/em/command/heartbeat", "HEARTBEAT_CHECK", RequestMethod.GET, ContentType.APPLICATION_JSON);
//        }).start();
    }
}
