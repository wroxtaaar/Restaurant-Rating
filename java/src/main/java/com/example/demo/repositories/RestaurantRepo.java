
package com.example.demo.repositories;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.User;

public class RestaurantRepo {

	private Map<Long, Restaurant> restaurants;
    private static long autoIncrement;
    private Map<Long,Long> userRating;

	public RestaurantRepo() {
		this.restaurants = new HashMap<>();
		userRating = new HashMap<>();
		this.autoIncrement = 1;
	}

	public void registerRestaurant(Restaurant restaurant) {
		restaurant.setId(autoIncrement);
		restaurants.put(autoIncrement,restaurant);
		autoIncrement++;
		System.out.println(restaurant);
	}

	public Restaurant getRestaurantById(long resId) {
		return restaurants.get(resId);
	}

	public Map getAllRestaurants() {
		return restaurants;
		
	}
	public void setRatingWithUserId(long resId, long rating, long userId) {
		
		restaurants.get(resId).getRatings().put(userId, rating);
		Map<Long,Long> ratingMap = restaurants.get(resId).getRatings();
		
		double averageRating = 0;
		for (double ratingValue : ratingMap.values()) {
			averageRating += ratingValue;
        }
		averageRating = averageRating/(ratingMap.size());
		restaurants.get(resId).setAverageRating(averageRating);
	}
}