package com.example.demo.entities;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {

	private long id;
	private String name;
	private Map<Long,Long> ratings = new HashMap<>();
	private  double averageRating = 0;
    
	
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double newAvgRating) {
		this.averageRating = newAvgRating;
	}
	public Map<Long, Long> getRatings() {
		return ratings;
	}
	public void setRatings(Map<Long, Long> ratings) {
		this.ratings = ratings;
	}
	
	public Restaurant(String name2) {
		this.name = name2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	

}