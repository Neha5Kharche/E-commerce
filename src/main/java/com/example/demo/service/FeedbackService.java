package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FeedbackRepo;
import com.example.demo.model.Feedback;


@Service
public class FeedbackService {
	@Autowired
	FeedbackRepo repo;
	public void postFeedback(Feedback feedback)
	{
		repo.save(feedback);
	}
	
	public List<Feedback> getFeedbacks()
	{
		List<Feedback> feedbackList = new ArrayList<>();
		
		feedbackList.addAll(repo.findAll());
		
		return feedbackList;
	}
	
	

}
