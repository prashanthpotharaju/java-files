package com.prashanth.rest.exception.handling;

import java.net.Authenticator.RequestorType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice//@ControllerAdvice
public class RestServicesExceptionHandlers {
	
	//ArithematicException
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArithermaticException(ArithmeticException arithmeticException)
	{
		
		return new ResponseEntity<>("Please Check Values and Values Should not be zero",HttpStatus.BAD_REQUEST);
	}
	//NullPointerException
	
	/*
	 * @ExceptionHandler(NullPointerException.class) public ResponseEntity<String>
	 * handleNullPointerException(NullPointerException
	 * nullPointerException,HttpServletRequest httpServletRequest) {
	 * System.out.println(nullPointerException.getMessage());
	 * System.out.println(httpServletRequest.getContextPath());
	 * System.out.println(httpServletRequest.getPathInfo());
	 * 
	 * return new
	 * ResponseEntity<>("Please Check Values and Values Should not be EMpty or Null"
	 * ,HttpStatus.BAD_REQUEST); }
	 */
	
	//MethodArgumentNotValidException

	
	//Exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception exception,HttpServletRequest httpServletRequest)
	{
		System.out.println(exception.getMessage());
		System.out.println(httpServletRequest.getContextPath());
		System.out.println(httpServletRequest.getPathInfo());
		
		return new ResponseEntity<>("Please check the data getting Exception/Errors",HttpStatus.BAD_REQUEST);
	}
}
