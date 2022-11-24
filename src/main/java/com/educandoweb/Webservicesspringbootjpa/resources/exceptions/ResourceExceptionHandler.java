package com.educandoweb.Webservicesspringbootjpa.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.Webservicesspringbootjpa.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException error, HttpServletRequest request) {
		String error2 = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError error3 = new StandardError(Instant.now(), status.value(), error2, error.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error3);
	}

}
