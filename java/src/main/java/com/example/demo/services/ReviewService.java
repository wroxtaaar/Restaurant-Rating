package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.repositories.RestaurantRepo;
import com.example.demo.repositories.ReviewRepo;

public class ReviewService {

	private ReviewRepo reviewRepo;

	public ReviewService(ReviewRepo reviewRepo) {
		this.reviewRepo = reviewRepo;
	}

	public void addReview(List<String> tokens) {
		
		long rating = Long.parseLong(tokens.get(1).trim());
		long userId = Long.parseLong(tokens.get(2).trim());
		long restaurantId = Long.parseLong(tokens.get(3).trim());
		Review review = new Review(rating,userId,restaurantId);
		reviewRepo.addReview(review);	
		
	}

	public void getReviews(List<String> tokens) {
        
		long restaurantId = Long.parseLong(tokens.get(1));
		String userFilter = tokens.get(2);
		Map reviews = reviewRepo.getReviewsByResId(restaurantId);
		List<Review> reviewsList = new ArrayList<>(reviews.values());
		if (userFilter.equalsIgnoreCase("RATING_ASC")) {
            Collections.sort(reviewsList, Comparator.comparingLong(Review::getRating));
        } else if (userFilter.equalsIgnoreCase("RATING_DESC")) {
            Collections.sort(reviewsList, Comparator.comparingLong(Review::getRating).reversed());
        } 
        System.out.println(reviewsList);
	}
		

	public void getReviewsFilterOrder(List<String> tokens) {
		long restaurantId = Long.parseLong(tokens.get(1));
		long lowerBound = Long.parseLong(tokens.get(2));
		long upperBound = Long.parseLong(tokens.get(3));
		String userFilter = tokens.get(4);
		Map reviews = reviewRepo.getReviewsByResId(restaurantId);
		List<Review> reviewsList = new ArrayList<>(reviews.values());
		List<Review> filteredReviews = new ArrayList<>();
        for (Review review : reviewsList) {
            if (review.getRating() >= lowerBound && review.getRating() <= upperBound) {
                filteredReviews.add(review);
            }
        }
        if(userFilter.equals("RATING_DESC")){
            Collections.sort(filteredReviews, Comparator.comparingLong(Review::getRating).reversed());
        }else{
            Collections.sort(filteredReviews, Comparator.comparingLong(Review::getRating));
        }
        System.out.println(filteredReviews.toString()); 
	}
	
	
}