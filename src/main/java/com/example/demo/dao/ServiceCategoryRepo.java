package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ProductCategory;
import com.example.demo.model.ServiceCategory;

import jakarta.transaction.Transactional;

public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory, Long> {
	@Transactional
	@Modifying
	@Query("from ServiceCategory s  where  s.vendorId = :vendorId")
	public ArrayList<ServiceCategory> findServiceCategoryByVendors(String vendorId);
}
