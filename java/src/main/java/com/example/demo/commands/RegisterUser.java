package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;
import com.example.demo.entities.User;

public class RegisterUser implements ICommand {

	@Override
	public void execute(List<String> tokens) {
		String name = tokens.get(1).trim();
		User user = new User(name);
		ResturantRatingApplication.getInstance().registerUser(user);
		ResturantRatingApplication.getInstance().getUsers();
		
	}

	

}