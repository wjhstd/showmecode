package com.ityousee.boot.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RedisSubscribe implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] bytes) {
        //消息体
        String body = new String(message.getBody());
        //渠道名称
        String topic = new String(bytes);
        System.out.println("消息体："+body);
        System.out.println("渠道名称："+topic);
    }
}
