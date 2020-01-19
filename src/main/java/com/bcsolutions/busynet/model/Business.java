package com.bcsolutions.busynet.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@Entity
public class Business extends BaseEntity {
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;
	
	@NotNull
	private String name;
	
	private String description;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private User userCreated;
	
}
