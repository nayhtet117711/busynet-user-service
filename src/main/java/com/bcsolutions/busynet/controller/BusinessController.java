package com.bcsolutions.busynet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bcsolutions.busynet.constant.AppConst;
import com.bcsolutions.busynet.dto.GenericResponse;

@RestController
@RequestMapping("/business")
public class BusinessController {
	
	@GetMapping("/")
	public GenericResponse getBusinesses(@RequestParam(name=AppConst.Param.CLIENT_ID, required = false) Long clientId ) {
		// return all businesses 
		// if there is clientId in requestParam, return related business
		
		return null; 
	}
	
}
