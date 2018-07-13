package com.tan0.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController2 {
	@Value("${info}")
	private String info;
	
	@RequestMapping("/config1")
	public String info() {
		return "server: "+info;
	}
	
}
