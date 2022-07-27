package com.example.demo.exception;

import java.util.Date;

public class EntityResponse {
	
	private Date timestamp;
	private String message;
	private String response;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public EntityResponse(Date timestamp, String message, String response) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.response = response;
	}
	

}
