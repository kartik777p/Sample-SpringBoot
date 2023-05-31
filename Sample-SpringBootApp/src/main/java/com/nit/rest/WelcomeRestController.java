package com.nit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
 
	@GetMapping("/home")
	public String home() {
		System.out.println("WelcomeRestController.home()");
		return "Welcome to Home....!!!!!!!!";
	}
} 
