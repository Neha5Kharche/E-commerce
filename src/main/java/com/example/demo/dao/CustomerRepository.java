package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.customer;

public interface CustomerRepository extends JpaRepository<customer, String> {
	
	customer findByEmail(String email);

}
