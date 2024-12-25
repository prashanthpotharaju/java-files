package com.prashanth.spring.boot.orders;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Product {

	public Product()
	{
		System.out.println("Product is Createdddd");
	}
	
	@PostConstruct
	public void configureData()
	{
		System.out.println("This is acting as Bean Initialization Life Cycle Method....");
	}
	
	@PreDestroy
	public void removeConfig()
	{
		System.out.println("This is acting as Bean Destroy Life Cycle Method....");
	}
}
