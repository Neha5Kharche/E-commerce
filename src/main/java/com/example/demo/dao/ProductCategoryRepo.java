package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.model.ProductCategory;

import jakarta.transaction.Transactional;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {
	@Transactional
	@Modifying
	@Query("from ProductCategory p  where  p.vendorId = :vendorId")
	public ArrayList<ProductCategory> findProductCategoryByVendors(String vendorId);
	

	@Transactional
	@Modifying
	@Query("update ProductCategory p set p.productCategoryName=:productCategoryName,p.productCategoryIcon=:productCategoryIcon,p.productCategoryImage=:productCategoryImage where p.productCategoryId=:productCategoryId")
	public void updateProductCategoryDetails(@Param("productCategoryId") Long productCategoryId,@Param("productCategoryName") String productCategoryName,@Param("productCategoryIcon") String productCategoryIcon,@Param("productCategoryImage")String productCategoryImage);
	
}
