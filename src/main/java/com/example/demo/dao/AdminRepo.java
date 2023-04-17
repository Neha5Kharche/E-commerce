package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
	Admin findByUserid(String userid);

}
