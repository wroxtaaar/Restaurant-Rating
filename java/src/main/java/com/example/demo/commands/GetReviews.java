package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;

public class GetReviews implements ICommand{

	@Override
	public void execute(List<String> tokens) {
		ResturantRatingApplication.getInstance().getReviews(tokens);
		
	}

}