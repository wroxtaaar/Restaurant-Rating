package com.example.demo.repositories;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.entities.Review;

public class ReviewRepo {

	private static long autoIncrement;
	private Map<Long,Review> allReviews;
	private Map<Long,Map<Long,Review>> reviews;
	
	public ReviewRepo() {
		this.allReviews = new HashMap<>();
		this.reviews = new HashMap<>();
		this.autoIncrement = 1;
	}
	
	public void addReview(Review review) {
		review.setId(autoIncrement);
        Map<Long,Review> newReview = new HashMap<>();
        newReview = reviews.get(review.getRestaurantId());
        if(newReview != null){
            newReview.put(autoIncrement,review);
		    reviews.put(review.getRestaurantId(),newReview);
        }
        else{
            newReview = new HashMap<>();
            newReview.put(autoIncrement,review);
		    reviews.put(review.getRestaurantId(),newReview);
        }
        System.out.println("Review [id="+review.getId()+"] added successfully for Restaurant [id="+review.getRestaurantId()+"] by User [id="+review.getUserId()+"]!");
		autoIncrement++;	
	}

	public Map getReviewsByResId(long restaurantId) {
		return reviews.get(restaurantId);
	}

}