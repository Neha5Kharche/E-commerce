package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.CartRepository;
import com.example.demo.model.Cart;
import com.example.demo.model.Product;


@Service
public class CartService {
	
	@Autowired
	private CartRepository repo;
	
	
	
	public void addToCart(Product product,String cid)
	{
		
		System.out.println(product);
		Cart cart = new Cart();
		cart.setCustomerId(cid);
		cart.setProductId(product.getProductId());
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
		cart.setProductImage(product.getProductImage());
		cart.setProductStatus(product.getProductStatus());
		System.out.println(cart);
		repo.save(cart);
	}
	
	
	public ArrayList<Cart> getCartProductByCustomer(String cid)
	{
		ArrayList<Cart> cartProduct = repo.findByCustomerId(cid);
		
		return cartProduct;
	}
	
	

}