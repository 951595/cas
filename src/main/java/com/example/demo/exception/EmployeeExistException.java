package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class EmployeeExistException extends RuntimeException {
     private String message;
     
	public EmployeeExistException() {
		
	}

	public EmployeeExistException(String message) {
		super(message);
		this.message=message;
	}
	
	

}
