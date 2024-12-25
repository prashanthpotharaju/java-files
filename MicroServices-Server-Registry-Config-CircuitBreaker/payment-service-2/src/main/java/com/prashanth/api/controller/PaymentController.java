package com.prashanth.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.api.dto.PaymentDetailsDto;

@RestController
public class PaymentController {

	

@GetMapping("/banking/options")
	public List<String> getBankingOptions(@RequestBody PaymentDetailsDto paymentDetailsDto)
	{
		System.out.println("Request Recieved for Payment Service.....");
		
		//TODO
		//Service Layer-->Repository Layer
		
		return List.of("Net Banking","UPI","CREDIT CARD","DEBIT CARD");
	}
	
}
