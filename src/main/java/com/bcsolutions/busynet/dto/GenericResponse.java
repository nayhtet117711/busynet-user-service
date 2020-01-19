package com.bcsolutions.busynet.dto;

import lombok.Data;

@Data
public class GenericResponse {

	private boolean status;

	private String message;

	private Object payLoad;

	public GenericResponse(boolean status, String message, Object payLoad) {
		this.status = status;
		this.message = message;
		this.payLoad = payLoad;
	}

	public GenericResponse(boolean status, String string) {

		this.status = status;
		this.message = string;
	}

	public GenericResponse(boolean status, Object payLoad) {

		this.status = status;
		this.payLoad = payLoad;
	}

}