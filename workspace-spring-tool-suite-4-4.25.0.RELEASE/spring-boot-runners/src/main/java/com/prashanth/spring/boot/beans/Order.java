package com.prashanth.spring.boot.beans;

import org.springframework.stereotype.Component;

@Component
public class Order {

	public Order()
	{
		System.out.println("Order is Executed.......");
	}
}
