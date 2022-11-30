package com.flipmart.serviceDAO;

import java.util.List;

import com.flipmart.exception.FeedbackException;
import com.flipmart.exception.ProductException;
import com.flipmart.module.Feedback;

public interface FeedbackService {

	
	public List<Feedback> getFeedbackByCustomer(String custId) throws FeedbackException;
	
	public String addFeedbackForProduct(Integer pdtId, String feedback) throws ProductException, FeedbackException;
	
	public String deleteFeedback(Integer feedbackId) throws FeedbackException;
	
	public String updateFeedback(Integer feedbackId) throws FeedbackException;
}
