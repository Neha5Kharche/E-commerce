package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

import jakarta.transaction.Transactional;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {
	@Transactional
	@Modifying
	@Query("from ProductCategory p  where  p.vendorId = :vendorId")
	public ArrayList<ProductCategory> findProductCategoryByVendors(String vendorId);
}
