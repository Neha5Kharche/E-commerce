package com.example.demo.dao;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.VendorServiceProvided;

import jakarta.transaction.Transactional;



public interface ServiceRepo extends JpaRepository<VendorServiceProvided, Long> {
	
public ArrayList<VendorServiceProvided> getByserviceCategory(String serviceCategory);

@Transactional
@Modifying
@Query("update VendorServiceProvided s set s.servicePrice=:servicePrice,s.serviceStatus=:serviceStatus,s.serviceDescription=:serviceDescription where s.serviceId=:serviceId")
public void updateServiceDetails(@Param("serviceId") Long serviceId,@Param("servicePrice") String servicePrice,@Param("serviceStatus") String serviceStatus,@Param("serviceDescription") String serviceDescription);

}
