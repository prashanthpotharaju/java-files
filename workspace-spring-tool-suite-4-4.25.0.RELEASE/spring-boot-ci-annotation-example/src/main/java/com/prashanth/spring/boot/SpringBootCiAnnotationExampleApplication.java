package com.prashanth.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.util.FileSystemUtils;

import com.prashanth.spring.boot.ci.BankAccount;
import com.prashanth.spring.boot.ci.Customer;
import com.prashanth.spring.boot.ci.orders.Orders;
import com.prashanth.spring.boot.ci.orders.Product;

@SpringBootApplication
public class SpringBootCiAnnotationExampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(SpringBootCiAnnotationExampleApplication.class, args);
	BankAccount ba=container.getBean(BankAccount.class);
	System.out.println(ba.getCustomer());
	
	Customer cust1=(Customer)container.getBean("customerOne");
	System.out.println(cust1);
	
	Customer cust2=(Customer)container.getBean("customerTwo");
	System.out.println(cust2);
	
	
	
	
	System.out.println("===================com.prashanth.spring.boot.ci.order======================");
	
	Orders orders=container.getBean(Orders.class);
	System.out.println("order bean id:"+orders);
    System.out.println("product bean id inside the orders:"+orders.getProduct());
    System.out.println(orders.getOrderId());
    System.out.println(orders.getUserName());
    System.out.println(orders.getAmount());
    
    Product product1=(Product)container.getBean("productOne");
    System.out.println(product1);
    
    Product product2=(Product)container.getBean("productTwo");
    System.out.println(product2);
    
	
	
	
	
	}

	@Bean("customerTwo")
	public Customer getCustomerTwo()
	{
		System.out.println("##############Customer Object 2 is Created ############");
		return new Customer();
	}
	
	@Bean("productTwo")
	public Product getProductTwo()
	{
		System.out.println("###Prduct 2 Object is Created#######");
		return new Product();
		
	}
	
	
}
