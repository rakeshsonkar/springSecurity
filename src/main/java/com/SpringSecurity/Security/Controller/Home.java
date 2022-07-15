package com.SpringSecurity.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class Home {

	@GetMapping("/home")
	public String homeTest() {
		return "my is home";
	}
	@GetMapping("/login")
	public String login() {
		return "my is login";
	}
	@GetMapping("/register")
	public String register() {
		return "my is register";
	}
}
