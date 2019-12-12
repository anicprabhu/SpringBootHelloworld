package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@GetMapping("hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
}
