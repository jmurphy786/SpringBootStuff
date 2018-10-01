package com.qa.jmurphy.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index() {
		return "Hello World, Looks like there's a spring in my boot!";
	}
}
