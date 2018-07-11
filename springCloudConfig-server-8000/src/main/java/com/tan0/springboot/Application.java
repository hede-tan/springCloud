package com.tan0.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class Application {
	
    public static void main( String[] args ){
    	SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
    	builder.web(true).run(args);

    }
}
