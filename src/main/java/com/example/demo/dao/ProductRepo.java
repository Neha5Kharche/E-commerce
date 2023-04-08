package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	public ArrayList<Product> getByproductCategory(String productCategory);

}
