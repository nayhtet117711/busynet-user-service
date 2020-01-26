package com.bcsolutions.busynet.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@Entity
public class Branch extends BaseEntity {	
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Business business;
	
	@NotNull
	private String name;
	
	@ElementCollection
	@CollectionTable( name="address" )
	private List<String> address;
	
	@NotNull
	private String city;
	
	private String latLng;
	
	private String description;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private User userCreated;
	
}
