package com.prashanth.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.api.dto.OrderDetailsDto;
import com.prashanth.api.dto.PaymentDetailsDto;
import com.prashanth.api.service.UserServiceLayer;

@RestController
public class UserController {

	@Autowired
	UserServiceLayer userServiceLayer;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		System.out.println("Request Recieved for User Service.....");
		//TODO
				//Service Layer-->Repository Layer
		
		return "Hello EveryOne";
	}
	
	//MS COMMUNICATION
	@PostMapping("/add/order")
	public String createOrderFromOrderService(@RequestBody OrderDetailsDto orderDetailsDto)
	{
		//service layer-->repository
		return userServiceLayer.createOrder();
	}
	
	//Payement MS

     @GetMapping("/banking/options")
	 public List<String> getBankingOptions(@RequestBody PaymentDetailsDto paymentDetailsDto)
	 {
    	 
    	 
    	 return userServiceLayer.getPaymentDetails();
	 }
     
     
     
     
     
 	/*
 	 * @CircitBreaker(name="user-service",fallback="createOrderFailure") 
 	 * //MS COMMUNICATION
 	 * 
 	 * @PostMapping("/add/order") 
 	 * public String createOrderFromOrderService(@RequestBody OrderDetailsDto orderDetailsDto)
 	 *  {
 	 * //service layer-->repository
 	 *  return userServiceLayer.createOrder();
 	 *   }
 	 * 
 	 * //fallback method 
 	 * // public String createOrderFailure(Throwable ex)//Exception ex
 	 *  // {
 	 *   // System.out.println(ex.getMessage()); 
 	 *   // return "Order Service is not Responding,Please Contact support Team"; 
 	 *   
 	 *    }
 	 */
     
     // must add the application.properties writtennin notes 
     
     //add the dependecies
     //Resilence4j
     //actuator
     //aop
    	     

}
