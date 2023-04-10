package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ServiceRepo;
import com.example.demo.model.VendorServiceProvided;

@Service
public class ServiceService {
	@Autowired
	ServiceRepo repo;
	
	public void addService(VendorServiceProvided vendorService)
	{
		repo.save(vendorService);
	}
	
   public ArrayList<VendorServiceProvided> getServiceList()
   {
	   System.out.println(repo.findAll());
	   ArrayList<VendorServiceProvided> serviceList = new ArrayList<>();
	   serviceList.addAll(repo.findAll());
	   return serviceList;
   }
   public ArrayList<VendorServiceProvided> getByServiceCategory(String serviceCategory)
   {
	   ArrayList<VendorServiceProvided> serviceCategoryList = new ArrayList<>();
	   serviceCategoryList.addAll(repo.getByserviceCategory(serviceCategory));
	   return serviceCategoryList;
   }
}
