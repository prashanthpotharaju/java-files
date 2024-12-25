package com.prashanth.spring.boot.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.spring.boot.rest.api.service.ProductsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductsController {

	
	
	
       @Value("${contact.email}")
       public String contactEmail;
	
	
	
	   @GetMapping("/get/product")
	   public String getProductsData()
	   {
		   
		  // -->Service Layer--->Repository-->Entity
		   
		   return "This is Apple Product : Iphone 16PRo Max,  Please Contact:"+contactEmail;
		   
	   }
	   
	   
	   //Spirng Boot Actuator example
	   @PostMapping("/add/product")
	   public String addProductsData() {
	   	//TODO: process POST request
	   	
	   	return "Products Added";
	   }
	   
	   
}
