package com.bcsolutions.busynet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcsolutions.busynet.model.Business;

public interface BusinessRepo extends JpaRepository<Business, Long> {
	
	// Queries here
	
}
