package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ServiceCategoryRepo;
import com.example.demo.model.ProductCategory;
import com.example.demo.model.ServiceCategory;

@Service
public class ServiceCategoryService {
	@Autowired
	
	ServiceCategoryRepo repo;
	public void addServiceCategory(ServiceCategory serviceCategory)
	{
		repo.save(serviceCategory);
	}
	public ServiceCategory getById(Long sid)
	{
		ServiceCategory serviceCategory = repo.findById(sid).orElse(new ServiceCategory());
		return serviceCategory;
		
	}
	public ArrayList<ServiceCategory> getServiceCategoryList()
	{
		System.out.println(repo.findAll());
		ArrayList<ServiceCategory> serviceCategoryList = new ArrayList<>();
		serviceCategoryList.addAll(repo.findAll());
		return serviceCategoryList;
	}
	public ArrayList<ServiceCategory> getServiceCategoryByVendors(String vendorId)
	{
		ArrayList<ServiceCategory> serviceCategoryList = new ArrayList<>();
		serviceCategoryList.addAll(repo.findServiceCategoryByVendors(vendorId));
		return serviceCategoryList;
	}
	public ServiceCategory getByServiceCategoryId(Long sid)
	{
		ServiceCategory serviceCategory = repo.findById(sid).orElse(new ServiceCategory());
		
		return  serviceCategory;
	}
	
	
	
	public void updateServiceCategoryDetails(Long sid,String sName,String sImage)
	{
			repo.updateServiceCategoryDetails(sid, sName, sImage);
		System.out.println(repo.findById(sid));
	}
	
	
}
