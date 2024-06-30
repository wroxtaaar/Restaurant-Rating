package com.example.demo.entities;

import java.util.List;

public class Review {

	private long id;
	private long restaurantId;
	private long userId;
	private long rating;
	private String description;
	private List<String> dishNames;
	
	public Review(long rating2, long userId2, long restaurantId2) {
		this.rating = rating2;
		this.userId = userId2;
		this.restaurantId = restaurantId2;	
	}
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getDishNames() {
		return dishNames;
	}
	public void setDishNames(List<String> dishNames) {
		this.dishNames = dishNames;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + "]";
	}
	
	

}