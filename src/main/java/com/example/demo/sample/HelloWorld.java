package com.example.demo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(path ="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
		
}
