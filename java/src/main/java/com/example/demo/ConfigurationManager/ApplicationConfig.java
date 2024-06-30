package com.example.demo.ConfigurationManager;

import com.example.demo.commands.AddRating;
import com.example.demo.commands.AddReview;
import com.example.demo.commands.CommandRegistry;
import com.example.demo.commands.DescribeResturant;
import com.example.demo.commands.GetReviews;
import com.example.demo.commands.GetReviewsFilterOrder;
import com.example.demo.commands.ListRestaurants;
import com.example.demo.commands.RegisterRestaurant;
import com.example.demo.commands.RegisterUser;

public class ApplicationConfig {

    private final CommandRegistry commandRegistry = new CommandRegistry();

    public CommandRegistry getCommandInvoker(){
    	
    	commandRegistry.registerCommand("REGISTER_RESTAURANT", new RegisterRestaurant());
        commandRegistry.registerCommand("REGISTER_USER", new RegisterUser());
        commandRegistry.registerCommand("ADD_RATING", new AddRating());
        commandRegistry.registerCommand("GET_REVIEWS", new GetReviews());
    	commandRegistry.registerCommand("GET_REVIEWS_FILTER_ORDER", new GetReviewsFilterOrder());
        commandRegistry.registerCommand("DESCRIBE_RESTAURANT", new DescribeResturant());
        commandRegistry.registerCommand("LIST_RESTAURANT", new ListRestaurants());
        commandRegistry.registerCommand("ADD_REVIEW", new AddReview());
        return commandRegistry;
    }
}
//build by KNU