package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductCategoryRepo;
import com.example.demo.model.ProductCategory;

@Service
public class ProductCategoryService {
	
	@Autowired
	ProductCategoryRepo repo;
	
	public void addProductCategory(ProductCategory productCategory)
	{
		repo.save(productCategory);
	}
	
	public ArrayList<ProductCategory> getProductCategoryList()
	{
		System.out.println(repo.findAll());
		ArrayList<ProductCategory> productCategoryList = new ArrayList<>();
		productCategoryList.addAll(repo.findAll());
		return productCategoryList;
	}
	public ArrayList<ProductCategory> getProductCategoryByVendors(String vendorId)
	{
		ArrayList<ProductCategory> productCategoryList = new ArrayList<>();
		productCategoryList.addAll(repo.findProductCategoryByVendors(vendorId));
		return productCategoryList;
	}
	

}
