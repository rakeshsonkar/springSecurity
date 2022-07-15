package com.SpringSecurity.Security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.Security.Model.User;
import com.SpringSecurity.Security.Services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	//all Users
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.userService.getAllUsers();
	}
	
	//single User
	// 

	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
		
		return this.userService.addUser(user);
	}
	
	
}
