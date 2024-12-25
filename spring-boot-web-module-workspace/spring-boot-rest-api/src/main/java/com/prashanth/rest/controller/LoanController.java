package com.prashanth.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	@GetMapping(path="/get/emi")
	public int getEmiValue()
	{
		String name=null;
		name.length();	//NullPointerException if it is not handled in RestServicesExceptionHandlers 
		//then Exception handler reached @ExceptionHandler(Exception.class)
		int value1=100;
		int value2=0;
		return value1/value2;//ArithematicException  if it is not handled in RestServicesExceptionHandlers 
		//then Exception handler reached @ExceptionHandler(Exception.class)
	}
}
