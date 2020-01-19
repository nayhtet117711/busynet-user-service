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
public class Client extends BaseEntity{
	
	@NotNull
	private String name;
	
	@NotNull
	private String email;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private SuperAdmin adminCreated;
	
}
