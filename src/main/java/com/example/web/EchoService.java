package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoService {

	@GetMapping("/api/v1/echo/{text}")
	public String echo(@PathVariable String text) {
		
		return text;
	}
	
}
