package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductCategoryRepo;
import com.example.demo.dao.ProductRepo;
import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

@Service
public class ProductService {
	@Autowired
ProductRepo repo;
	
	public void addProduct(Product product)
	{
		repo.save(product);
	}
	
	public Product getById(Long pid)
	{
		Product productDetails = repo.findById(pid).orElse(new Product());
		return productDetails;
		
	}
	
	public ArrayList<Product> getProductList()
	{
		System.out.println(repo.findAll());
		ArrayList<Product> productList = new ArrayList<>();
		productList.addAll(repo.findAll());
		return productList;
	}
	
	public ArrayList<Product> getByProductCategory(String productCategory)
	{
		ArrayList<Product> productCategoryList = new ArrayList<>();
		productCategoryList.addAll(repo.getByproductCategory(productCategory));
		return productCategoryList;
	}
	
	public ArrayList<Product> getByProductCategory(String productCategory,String vendorId)
	{
		ArrayList<Product> productCategoryList = new ArrayList<>();
		productCategoryList.addAll(repo.getByproductCategory(productCategory,vendorId));
		
		return productCategoryList;
	}
	public ArrayList<Product> getByProduct(String vendorId)
	{
		ArrayList<Product> productCategoryList = new ArrayList<>();
		productCategoryList.addAll(repo.getByproduct(vendorId));
		
		return productCategoryList;
	}
	
	public Product getByProductId(Long pid)
	{
		Product productDetails = repo.findById(pid).orElse(new Product());
		
		return  productDetails;
	}
	
	public void updateProductDetails(Long pid,String pPrice,String pStatus,String pDescription)
	{
			repo.updateProductDetails(pid, pPrice, pStatus);
		System.out.println(repo.findById(pid));
	}
	

}