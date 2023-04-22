package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.customer;

@Service
public class CustomerService {
     @Autowired
	 CustomerRepository crepo;
     
     public void createCustomer(customer c) {
    	crepo.save(c);
     }
	 public boolean login(String email,String password)
	 {
		 customer c=crepo.getById(email);
		 if(c.getPassword().equals(password))
		 {
			 return true;
		 }else {
			 return false;
		 }
			 
		 
	 }
	 
	
	 public customer getByEmail(String email)
	 {
		 customer c = crepo.findByEmail(email);
		 
		 return c;
	 }
	 
	 public void resetPassword(String email,String password)
	 {
		 customer c=crepo.getById(email);
		 c.setPassword(password);
		 crepo.save(c);
	 }
}