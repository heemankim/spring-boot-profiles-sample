package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private Values value;
	
	public DemoController(Values value) {
		this.value = value;
	}
	
	@GetMapping("profiles")
	private String getProfile() {
		return "current Profile : " + value.getProfile();
	}
	
}
