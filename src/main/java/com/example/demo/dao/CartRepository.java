package com.example.demo.dao;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {
	
	public ArrayList<Cart> findByCustomerId(String customerId);
	
	
	

}