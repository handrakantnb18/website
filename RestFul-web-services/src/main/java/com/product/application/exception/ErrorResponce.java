package com.product.application.exception;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponce {

	private LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;
	private String path;
	private Map<String, String> validationErrors;
}

