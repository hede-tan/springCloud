package com.tan0.springboot;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 *消息消费者
 */
@Component
@RabbitListener(queues = "hello")  //监听
public class Receiver {
	
    @RabbitHandler  //处理
    public void process(String msg) {
        System.out.println("Receiver: "+msg);
    }
    
}
