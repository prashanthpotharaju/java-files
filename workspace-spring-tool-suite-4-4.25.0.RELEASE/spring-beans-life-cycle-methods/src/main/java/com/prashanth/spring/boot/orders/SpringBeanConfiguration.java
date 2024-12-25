package com.prashanth.spring.boot.orders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

	@Bean
	public Order getOrderTwo()
	{
		System.out.println("Order2 is executed.....");
		return new Order();
		
	}
}
