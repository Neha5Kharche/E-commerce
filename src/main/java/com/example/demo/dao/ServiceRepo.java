package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.VendorServiceProvided;

public interface ServiceRepo extends JpaRepository<VendorServiceProvided, Long> {
	public ArrayList<VendorServiceProvided> getByserviceCategory(String serviceCategory);

}
