package com.tan0.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
	
    public static void main( String[] args ){
    	SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
    	builder.web(true).run(args);

    }
}
