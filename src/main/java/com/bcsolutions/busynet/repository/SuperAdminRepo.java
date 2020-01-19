package com.bcsolutions.busynet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcsolutions.busynet.model.SuperAdmin;

public interface SuperAdminRepo extends JpaRepository<SuperAdmin, Long> {
	
	// Queries here
	
}
