package com.bcsolutions.busynet.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long tsCreated;
	
	private Long tsUpdated;
	
	@PrePersist
	protected void onCreate() {
		tsCreated = Instant.now().getEpochSecond();
		tsUpdated = Instant.now().getEpochSecond();
	}
	
	@PreUpdate
	protected void onUpdate() {
		tsUpdated = Instant.now().getEpochSecond();
	}
	
}
