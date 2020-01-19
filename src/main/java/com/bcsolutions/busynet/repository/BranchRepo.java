package com.bcsolutions.busynet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcsolutions.busynet.model.Branch;

public interface BranchRepo extends JpaRepository<Branch, Long> {
	
	// Queries here
	
}
