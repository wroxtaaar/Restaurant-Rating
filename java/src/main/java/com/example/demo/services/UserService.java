package com.example.demo.services;

import java.util.Map;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

public class UserService {

	private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public void registerUser(User user) {
		userRepo.registerUser(user);
		
		
	}

	public void getUsers() {
		Map res = userRepo.getUsers();
		
		
	}

	
}