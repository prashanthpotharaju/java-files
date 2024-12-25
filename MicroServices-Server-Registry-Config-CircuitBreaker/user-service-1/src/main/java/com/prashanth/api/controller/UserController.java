package com.prashanth.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Value("${contact.email}")//property specific to user-service only
	String emailContact;

	@GetMapping("/hello")
	public String sayHello()
	{
		System.out.println("Request Recieved for User Service.....");
		//TODO
				//Service Layer-->Repository Layer
		
		return "Hello  This is your UserID:"+emailContact;
	}

}
