package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;
import com.example.demo.entities.Restaurant;
import com.example.demo.entities.User;

public class RegisterRestaurant implements ICommand {	

	@Override
	public void execute(List<String> tokens) {
		String name = tokens.get(1).trim();
		Restaurant restaurant  = new Restaurant(name);
		ResturantRatingApplication.getInstance().registerRestaurant(restaurant);
		
		
	}
}