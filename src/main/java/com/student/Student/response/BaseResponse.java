package com.student.Student.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse {

	@JsonProperty("StatusCode")
	int statusCode;
	
	@JsonProperty("Message")
	String message;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BaseResponse(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
}
