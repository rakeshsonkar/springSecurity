package com.SpringSecurity.Security.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.SpringSecurity.Security.Model.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();

	public UserService() {

		list.add(new User("abc","123","abc@gmail.com"));
		list.add(new User("abc2","123","abc2@gmail.com"));
		list.add(new User("abc3","123","abc3@gmail.com"));
		list.add(new User("abc4","123","abc4@gmail.com"));
	}
	//get All Users
	public List<User> getAllUsers(){
		return this.list;
	}
	// get single  user
	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	// create user 
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
