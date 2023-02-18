package com.StudentReport.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandler {

	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<String> getStudentException(StudentException getException){
		
		return new ResponseEntity<>(getException.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
	
	
	
}
