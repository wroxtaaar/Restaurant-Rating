package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.repositories.RestaurantRepo;
import com.example.demo.repositories.UserRepo;

public class RestaurantService {

	private RestaurantRepo resRepo;

	public RestaurantService(RestaurantRepo resRepo) {
		this.resRepo = resRepo;
	}
	
	public void registerRestaurant(Restaurant restaurant) {
		resRepo.registerRestaurant(restaurant);
	}
	
	public void describeResturant(List<String> tokens) {
		long resId = Long.parseLong(tokens.get(1));
		Restaurant res = resRepo.getRestaurantById(resId);
		double avgRating = res.getAverageRating();
		System.out.println("Restaurant [id="+ res.getId()+ ", name=" + res.getName()+ ", rating=" + Double.parseDouble(String.format("%.1f", res.getAverageRating())) +"]");
	}
	
	public void getRestaurants() {
		Map<Long,Restaurant> resMap = resRepo.getAllRestaurants();
		List<Restaurant> restaurantsList = new ArrayList<>(resMap.values());
        Collections.sort(restaurantsList, Comparator.comparingDouble(Restaurant::getAverageRating).reversed());
        System.out.println(restaurantsList.toString());
		
	}

	public void setRatingWithUserId(long resId, long rating, long userId) {
		resRepo.setRatingWithUserId( resId,  rating,  userId);
		
	}

}
//build by KNU