package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeExistException.class)
	public ResponseEntity<?> EmployeeExistExceptionHandling(EmployeeExistException exception, WebRequest request){
		EntityResponse er= new EntityResponse(new Date(),exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<?>globalExceptionHandling(Exception ex, WebRequest request){
		EntityResponse er=new EntityResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	

	
	

	
}
