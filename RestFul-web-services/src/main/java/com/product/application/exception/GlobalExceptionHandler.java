package com.product.application.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponce> handleNotFound(ResourceNotFoundException ex, HttpServletRequest request) 
	{
		ErrorResponce error = new ErrorResponce(
				LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				"Not Found",
				ex.getMessage(),
				request.getRequestURI(),
				null
				);
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponce> handleValidation(MethodArgumentNotValidException ex, HttpServletRequest request) 
	{
		Map<String, String> fieldErrors = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(fe ->
		fieldErrors.put(fe.getField(), fe.getDefaultMessage())
		);
		
		ErrorResponce error = new ErrorResponce(
				LocalDateTime.now(),
				HttpStatus.BAD_REQUEST.value(),
				"Validation Failed",
				"One or  more fields are invalid",
				request.getRequestURI(),
				fieldErrors
				);
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorResponce> handleIllegalArgument(IllegalArgumentException ex, HttpServletRequest request)
	{
		ErrorResponce error = new ErrorResponce(
				LocalDateTime.now(),
				HttpStatus.BAD_REQUEST.value(),
				"Bad Request",
				ex.getMessage(),
				request.getRequestURI(),
				null
				);
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponce> handleGeneric(Exception ex, HttpServletRequest request)
	{
		ErrorResponce error = new ErrorResponce(
				LocalDateTime.now(),
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				"Internal Server Error",
				ex.getMessage(),
				request.getRequestURI(),
				null
				);
		
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
