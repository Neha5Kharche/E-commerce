package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Help;

import jakarta.transaction.Transactional;

public interface HelpRepo extends JpaRepository<Help, Long> {
	@Transactional
	@Modifying
	@Query("update Help h set h.solution=:solution where h.helpId=:helpId")
	public void updateSolutionDetails(@Param("helpId") Long helpId,@Param("solution") String solution);
	public List<Help> findBycustomerId(String customerId);
	
}
