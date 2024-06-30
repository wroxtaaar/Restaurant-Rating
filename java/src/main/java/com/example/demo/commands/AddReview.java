package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;

public class AddReview implements ICommand{

	

	@Override
	public void execute(List<String> tokens) {
		
		ResturantRatingApplication.getInstance().addReview(tokens);
		long resId = Long.parseLong(tokens.get(3));
		long userId = Long.parseLong(tokens.get(1));
		long rating = Long.parseLong(tokens.get(2));
		ResturantRatingApplication.getInstance().setAvgRating(resId,rating,userId);
	}

}