package com.customer.dao;

import java.util.List;

import com.customer.entity.Customers;
import com.customer.entity.Feedback;

public interface FeedbackDao {
	Feedback createFeedback(Feedback feedback);
	 Feedback getFeedbackById(String feedbackID);
	 List<Feedback> getAllFeedbacks();
	 void updateFeedback( Feedback feedback);
	 void deleteFeedback( Feedback feedback);
	 List<Feedback> getFeedbacksByCustomerId(String customerID);
	 Customers getCustomerById(String customerID);
}
