package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VendorRepository;
import com.example.demo.model.vendor;

@Service
public class VendorService {
     @Autowired
	 VendorRepository vrepo;
     
     public void createVendor(vendor v) {
    	vrepo.save(v);
     }
	 public boolean login(String email,String password)
	 {
		 vendor v=vrepo.getById(email);
		 if(v.getPassword().equals(password))
		 {
			 return true;
		 }else {
			 return false;
		 }
			 
		 
	 }
}
