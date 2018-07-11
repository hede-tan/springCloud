package com.tan0.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	@Value("${info}")
	private String info;
	
	@RequestMapping("/config")
	public String info() {
		return "server: "+info;
	}
	
}
