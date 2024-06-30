package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;

public class AddRating implements ICommand{

	@Override
	public void execute(List<String> tokens) {
		ResturantRatingApplication.getInstance().addReview(tokens);
		long resId = Long.parseLong(tokens.get(3));
		long rating = Long.parseLong(tokens.get(1));
		long userId = Long.parseLong(tokens.get(2));
		ResturantRatingApplication.getInstance().setAvgRating(resId,rating,userId);
		
	}
	

	

}