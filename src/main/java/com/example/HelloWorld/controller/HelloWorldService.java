package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@GetMapping("/")
	public String home() {
		return "This is Home Page Original";
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "This is Hello World";
	}
}
