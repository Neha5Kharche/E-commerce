package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Help;

public interface HelpRepo extends JpaRepository<Help, Long> {

}
