package com.prashanth.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/hello")
	public String sayHello()
	{
		System.out.println("Request Recieved for User Service.....");
		//TODO
				//Service Layer-->Repository Layer
		
		return "Hello EveryOne";
	}

}
