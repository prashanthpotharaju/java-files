package com.prashanth.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.api.dto.OrderDetailsDto;
import com.prashanth.api.dto.PaymentDetailsDto;
import com.prashanth.api.feign.clients.OrderServiceFeignClient;
import com.prashanth.api.feign.clients.PaymentServiceFeignClient;

@Service
public class UserServiceLayer {

	@Autowired
	OrderServiceFeignClient orderServiceFeignClient;
	
	@Autowired
	PaymentServiceFeignClient paymentServiceFeignClient;
	
	public String createOrder()
	{
		//REST API CALLING FOR ORDER SERVICE
		OrderDetailsDto dto=new  OrderDetailsDto();
		dto.setOrderId("a101");
		dto.setAmount(2309.00);
		
		String result=orderServiceFeignClient.addOrder(dto);
		return result;
	}
	
	//payment
	
	public List<String> getPaymentDetails()
	{
		
		PaymentDetailsDto dto=new PaymentDetailsDto();
		dto.setUsername("david123");
		dto.setPassword("p1234");
		
		List<String> result=paymentServiceFeignClient.getBankingOptions(dto);
		return result;
	}
	
	
}
