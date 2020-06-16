package com.infotech.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

	@GetMapping(value = "/HELLO")
	public String hello() {
		return "Welcome to SpringBoot";
	}
}
