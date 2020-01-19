package com.bcsolutions.busynet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcsolutions.busynet.model.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
	
	// Queries here
	
}
