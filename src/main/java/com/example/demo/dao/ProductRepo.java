package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	
	@Transactional
	@Modifying
	@Query("from Product p  where p.productCategory = :productCategory and p.vendorId = :vendorId")
	public ArrayList<Product> getByproductCategory(String productCategory,String vendorId);
	
	@Transactional
	@Modifying
	@Query("from Product p  where  p.vendorId = :vendorId")
	public ArrayList<Product> getByproduct(String vendorId);
	
	@Transactional
	@Modifying
	@Query("from Product p  where  p.productName like '%:productName%'")
	List<Product> findByProductName(String productName);
	
	public ArrayList<Product> getByproductCategory(String productCategory);
	
	@Transactional
	@Modifying
	@Query("update Product p set p.productPrice=:productPrice,p.productStatus=:productStatus,p.productDescription=:productDescription where p.productId=:productId")
	public void updateProductDetails(@Param("productId") Long productId,@Param("productPrice") String productPrice,@Param("productStatus")String productStatus,@Param("productDescription")String productDescription);
	
	@Transactional
	@Modifying
	@Query("from Product p  where  p.productName IN (:productName)")
	public ArrayList<Product> getFilterByproduct(@Param("productName") List<String> productName);

	public List<Product> findByProductNameLike(String productName);
	
	

	
}
