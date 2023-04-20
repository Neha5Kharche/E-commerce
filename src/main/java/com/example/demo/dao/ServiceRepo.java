package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Product;
import com.example.demo.model.VendorServiceProvided;

import jakarta.transaction.Transactional;



public interface ServiceRepo extends JpaRepository<VendorServiceProvided, Long> {
	
	@Transactional
	@Modifying
	@Query("from VendorServiceProvided s  where s.serviceCategory = :serviceCategory and s.vendorId = :vendorId")
	public ArrayList<VendorServiceProvided> getByserviceCategory(String serviceCategory,String vendorId);
	
	@Transactional
	@Modifying
	@Query("from VendorServiceProvided s  where  s.vendorId = :vendorId")
	public ArrayList<VendorServiceProvided> getByservice(String vendorId);
	
	
public ArrayList<VendorServiceProvided> getByserviceCategory(String serviceCategory);

@Transactional
@Modifying
@Query("update VendorServiceProvided s set s.servicePrice=:servicePrice,s.serviceStatus=:serviceStatus,s.serviceDescription=:serviceDescription where s.serviceId=:serviceId")
public void updateServiceDetails(@Param("serviceId") Long serviceId,@Param("servicePrice") String servicePrice,@Param("serviceStatus") String serviceStatus,@Param("serviceDescription") String serviceDescription);

@Transactional
@Modifying
@Query("from VendorServiceProvided s  where  s.serviceName IN (:serviceName)")
public ArrayList<VendorServiceProvided> getFilterByservice(@Param("serviceName") List<String> serviceName);

}
