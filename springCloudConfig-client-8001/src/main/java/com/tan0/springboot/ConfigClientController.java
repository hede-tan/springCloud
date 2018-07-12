package com.tan0.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${info}")
	private String info;
	
	@RequestMapping("/config")
	public String info() {
		return "server: "+info;
	}
	
}
