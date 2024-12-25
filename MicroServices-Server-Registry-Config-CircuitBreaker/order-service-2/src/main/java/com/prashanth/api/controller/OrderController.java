package com.prashanth.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.api.dto.OrderDetailsDto;

@RestController
public class OrderController {



	@PostMapping("/add")
	public String addOrder(@RequestBody OrderDetailsDto orderDetailsDto)
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
