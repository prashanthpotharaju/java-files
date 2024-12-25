package com.autowired.spring.boot.organization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringBeanConfigurations {

	//@Primary
	@Bean("emp2")
	public Employee getEmp2()
	{
		System.out.println("======Employee 2nd object is created====");
		return new Employee();
	}
	
}
