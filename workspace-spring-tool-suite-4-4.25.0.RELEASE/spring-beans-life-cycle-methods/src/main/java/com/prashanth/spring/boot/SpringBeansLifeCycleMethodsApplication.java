package com.prashanth.spring.boot;

import java.io.PrintStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanth.spring.boot.orders.Order;

@SpringBootApplication
public class SpringBeansLifeCycleMethodsApplication {

	public static void main(String[] args) {
		System.out.println("Spring context/container is gettting Ready....");
		
ConfigurableApplicationContext container=		SpringApplication.run(SpringBeansLifeCycleMethodsApplication.class, args);
	
Order order=(Order)container.getBean("order");
	System.out.println(order);
	System.out.println(order.getOrderId());
	System.out.println(order.getUserName());
	System.out.println(order.getCompanyName());
	
	
	System.out.println("Utilized the bean Object of Order Bean class:"+order);
	
	
	System.out.println("Spring context/container is getting closed");
 container.close();//if we are not using this then destroy() is called by container by default
	System.out.println("Spring context/container is closed");
	
	}

}
