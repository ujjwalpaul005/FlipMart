package com.flipmart.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flipmart.exception.FeedbackException;
import com.flipmart.exception.ProductException;
import com.flipmart.module.Feedback;
import com.flipmart.serviceDAO.FeedbackService;



@Service
public class FeedbackLogic implements FeedbackService{

	@Override
	public List<Feedback> getFeedbackByCustomer(String custId) throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addFeedbackForProduct(Integer pdtId, String feedback) throws ProductException, FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFeedback(Integer feedbackId) throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFeedback(Integer feedbackId) throws FeedbackException {
		// TODO Auto-generated method stub
		return null;
	}

}
