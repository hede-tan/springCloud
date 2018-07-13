package com.tan0.springboot;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class Application {
	
    public static void main( String[] args ){
    	SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
    	builder.web(true).run(args);

    }
    /**
     * 配置消息队列Bean
     */
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
