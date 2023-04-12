package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ServiceRepo;
import com.example.demo.model.Product;
import com.example.demo.model.VendorServiceProvided;

@Service
public class ServiceService {
	@Autowired
	ServiceRepo repo;
	
	public void addService(VendorServiceProvided vendorService)
	{
		repo.save(vendorService);
	}
	public VendorServiceProvided getById(Long sid)
	{
		VendorServiceProvided serviceDetails = repo.findById(sid).orElse(new VendorServiceProvided());
		return serviceDetails;
		
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
   public ArrayList<VendorServiceProvided> getByServiceCategory(String serviceCategory,String vendorId)
   {
	   ArrayList<VendorServiceProvided> serviceCategoryList = new ArrayList<>();
//	   serviceCategoryList.addAll(repo.getByserviceCategory(serviceCategory,vendorId));
	   return serviceCategoryList;
   }
   
   public VendorServiceProvided getByServiceId(Long sid)
	{
		VendorServiceProvided serviceDetails = repo.findById(sid).orElse(new VendorServiceProvided());
		
		return  serviceDetails;
	}
	
	public void updateServiceDetails(Long sid,String sPrice,String sStatus, String sDescription)
	{
			repo.updateServiceDetails(sid, sPrice, sStatus, sDescription);
		System.out.println(repo.findById(sid));
	}
	
}
