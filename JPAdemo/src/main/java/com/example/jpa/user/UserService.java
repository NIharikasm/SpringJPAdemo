package com.example.jpa.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private userRepo userrepo; 

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		for(User usr:userrepo.findAll()) {
			users.add(usr);
		}
		return users;
	}

	public String addUser(User user) {
	if(!userrepo.findById(user.getId()).isPresent()) {
			userrepo.save(user);
			return "user added";
	}
	return "user not added";
	}

	public String updateUser(User user, String id) {
		if(userrepo.findById(user.getId()).isPresent()) {
			userrepo.save(user);
			return "user updated";
	  }
		return "user not updated";
	}

}
