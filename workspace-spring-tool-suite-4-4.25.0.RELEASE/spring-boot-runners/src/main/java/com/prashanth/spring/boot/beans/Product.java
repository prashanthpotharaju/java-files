package com.prashanth.spring.boot.beans;

import org.springframework.stereotype.Component;

@Component
public class Product {

	public Product()//Product(int id)
	{
		System.out.println("Product is Executed.....");
	}
}
