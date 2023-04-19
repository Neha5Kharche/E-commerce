package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HelpRepo;
import com.example.demo.model.Help;

@Service
public class HelpService {
	
	
	@Autowired
	HelpRepo repo;
	
	
	public void postQuery(Help help)
	{
		repo.save(help);
	}
	
	public List<Help> getQuerys()
	{
		List<Help> querysList = new ArrayList<>();
		
		querysList.addAll(repo.findAll());
		
		return querysList;
	}
	public void updateSolution(Long queryId,String solution)
	{
		repo.updateSolutionDetails(queryId, solution);
	}
	public List<Help> getqueryBycustomerId(String customerId)
	{
List<Help> querysList = new ArrayList<>();
		
		querysList.addAll(repo.findBycustomerId(customerId));
		
		return querysList;
	}
}
