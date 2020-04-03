package com.example.jpa.user;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userservice.getAllUsers();
				
	}
	
	@RequestMapping(method=RequestMethod.POST ,value = "/users")
	public String addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/users/{id}")
	public String updateUser(@RequestBody User user , @PathVariable String id) {
		return userservice.updateUser(user,id);
	}
	
}
