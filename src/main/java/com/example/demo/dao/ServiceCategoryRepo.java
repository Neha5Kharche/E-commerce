package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ProductCategory;
import com.example.demo.model.ServiceCategory;

import jakarta.transaction.Transactional;

public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory, Long> {
	//@Transactional
	//@Modifying
	//@Query("from ServiceCategory s  where  s.vendorId = :vendorId")
	//public ArrayList<ServiceCategory> findServiceCategoryByVendors(String vendorId);

	@Transactional
	@Modifying
	@Query("update ServiceCategory s set s.serviceCategoryName=:serviceCategoryName,s.serviceCategoryIcon=:serviceCategoryIcon,s.serviceCategoryImage=:serviceCategoryImage where s.serviceCategoryId=:serviceCategoryId")
	public void updateServiceCategoryDetails(@Param("serviceCategoryId") Long serviceCategoryId,@Param("serviceCategoryName") String serviceCategoryName,@Param("serviceCategoryIcon") String serviceCategoryIcon,@Param("serviceCategoryImage")String serviceCategoryImage);
}
