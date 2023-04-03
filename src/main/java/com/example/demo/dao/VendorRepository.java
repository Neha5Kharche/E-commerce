package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.vendor;

public interface VendorRepository extends JpaRepository<vendor, String> {
//public vendor findByEmail(String email);
}
