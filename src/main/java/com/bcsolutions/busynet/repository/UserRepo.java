package com.bcsolutions.busynet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcsolutions.busynet.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	// Queries here
	
}
