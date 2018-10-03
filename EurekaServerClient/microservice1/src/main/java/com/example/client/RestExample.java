package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestExample {

	@Autowired
	private RestTemplate restExample;
	
	@RequestMapping("/execute")
	public String execute() {
		
		return restExample.getForObject("http://CLIENT2/serviceinfo", String.class);
		
		
	}
}
