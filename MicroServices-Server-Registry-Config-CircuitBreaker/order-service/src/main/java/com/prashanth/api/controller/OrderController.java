package com.prashanth.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {



	@PostMapping("/add")
	public String addOrder()
	{
		System.out.println("Request Recieved for Order Service.....");
		
		//TODO
		//Service Layer-->Repository Layer
		
		return "Hello EveryOne Order Added";
	}
	//update order
	//delete order
	//load order by userid
	//cancel order
	//payment status of an order
}
