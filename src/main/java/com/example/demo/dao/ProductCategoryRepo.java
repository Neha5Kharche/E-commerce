package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductCategory;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {

}
