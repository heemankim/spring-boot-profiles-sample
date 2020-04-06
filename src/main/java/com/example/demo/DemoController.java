package com.example.demo;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private Environment env;
	
	public DemoController(Environment environment) {
		this.env = environment;
	}
	
	@GetMapping("profiles")
	private String getProfile() {
		return "ActivatedProfiles : " + env.getActiveProfiles()[0];
	}
	
}
