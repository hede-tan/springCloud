package com.tan0.springboot;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 消息生产者
 */
@Component
public class Sender {
	
    @Autowired
    private AmqpTemplate rabbitTemplate;
    
    public void send() {
    	
        String msg = "hello rabbitmq:"+new Date();
        System.out.println("Sender:"+msg);
        //第一个参数 hello,是消息队列名称
        //第二个参数 msg,是消息
        this.rabbitTemplate.convertAndSend("hello", msg);
        
    }
}