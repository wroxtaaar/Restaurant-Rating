package com.example.demo.repositories;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.entities.User;

public class UserRepo {
	
	private Map<Long, User> users;
    private static long autoIncrement;

	public UserRepo() {
		this.users = new HashMap<>();
		this.autoIncrement = 1;
	}

	public void registerUser(User user) {
		user.setId(autoIncrement);
		users.put(autoIncrement,user);
		autoIncrement++;
		System.out.println(user);
	}

	public Map getUsers() {
		return users;
	}

	

}