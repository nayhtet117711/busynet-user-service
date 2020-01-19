package com.bcsolutions.busynet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.bcsolutions.busynet.constant.AppConst;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@Entity
public class User extends BaseEntity{
	
	@NotNull
	private String name;

	private String email;
	
	@OneToMany( fetch = FetchType.LAZY )
	private List<String> phoneNumber;
	
//	@OneToMany( fetch = FetchType.LAZY )
	private List<String> address;
	
//	@ManyToOne( fetch = FetchType.LAZY )
	private AppConst.UserType userType;
	
}
