package com.example.demo.commands;

import java.util.List;
import com.example.demo.ConfigurationManager.ResturantRatingApplication;

public class DescribeResturant implements ICommand{

	@Override
	public void execute(List<String> tokens) {
		
		ResturantRatingApplication.getInstance().describeResturant(tokens);
	}
	

	

}