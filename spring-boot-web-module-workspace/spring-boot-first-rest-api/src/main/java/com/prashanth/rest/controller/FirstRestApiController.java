package com.prashanth.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class FirstRestApiController {

	@RequestMapping("/hello")
	//@ResponseBody  //if we remove it then it will look for the view file
	//if it is not used means we need to add the view files 
	public String sayHello()
	{
		
		return "Hello EveryOne";
	}
	
	
	//URI path supporting the HTTP method of POST
	@PostMapping(path="/user/create")//which is equvilent to @RequestMapping(path="/user/create",method=RequestMethod.POST)
	//
	//@RequestMapping(path="/user/create",method=RequestMethod.POST)
	public String registerUser()
	{
		//Service --> Repository
		return "Registration Success.......";
	}
	
	@RequestMapping("/doller/price")
	//@ResponseBody
	public double getDoublePrice() {
	return 89.9998;
	}
	
	
	@RequestMapping(value="/order/info",method={RequestMethod.GET,RequestMethod.POST})//--SUPPORTS 2 HTTP METHOD GET,POST
	//@RequestMapping("/order/info")
	//@ResponseBody
	public Order getOrderData()
	{
		System.out.println("getOrderData() is called....");
		return new Order("order1117",1222.3);
	}
	
	//@PutMapping(path="/update/order") //which is equivalent to below
	//@PutMapping(path="/update/order",method=RequestMethod.PUT") or @RequestMapping(path="/update/order",method=RequestMethod.PUT)
	@RequestMapping(path="/update/order",method=RequestMethod.PUT,name="This is updated User")
	//@ResponseBody
	public String updateOrderData()
	{
		System.out.println("updateOrder() is called....");
		return "Order Data is Updated Successfullyyy.......";
	}
}
