package com.example.demo.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.User;
import com.example.demo.repositories.RestaurantRepo;
import com.example.demo.repositories.ReviewRepo;
import com.example.demo.repositories.UserRepo;
import com.example.demo.services.RestaurantService;
import com.example.demo.services.ReviewService;
import com.example.demo.services.UserService;

public class ResturantRatingApplication {

    private static ResturantRatingApplication instance;
    
    private UserService userService;
    private RestaurantService restaurantService;
    private ReviewService reviewService;
    

    private ResturantRatingApplication() {
    	this.userService= new UserService(new UserRepo());
    	this.restaurantService = new RestaurantService(new RestaurantRepo());
    	this.reviewService= new ReviewService(new ReviewRepo());
    	
    }

    public static ResturantRatingApplication getInstance() {
        if (instance == null) {
            instance = new ResturantRatingApplication();
        }
        return instance;
    }
    
    public void registerUser(User user) {
    	
    	userService.registerUser(user);
    	
    }
    public void getUsers() {
    	userService.getUsers();
    }

	public void registerRestaurant(Restaurant restaurant) {
		restaurantService.registerRestaurant(restaurant);
		
	}

	public void addReview(List<String> tokens) {
		
		reviewService.addReview(tokens);
	}

	public void describeResturant(List<String> tokens) {
		restaurantService.describeResturant(tokens);
		
	}

	public void getRestaurants() {
		restaurantService.getRestaurants();
		
	}

	public void setAvgRating(long resId, long rating,long userId) {
		restaurantService.setRatingWithUserId(resId, rating, userId);
		//restaurantService.calculateAverageRating(resId, rating,userId);
		
	}
	
	public void getReviews(List<String> tokens) {
		reviewService.getReviews(tokens);
	}
	
	public void getReviewsFilterOrder(List<String> tokens) {
		reviewService.getReviewsFilterOrder(tokens);
	}

   
}
//build by KNU