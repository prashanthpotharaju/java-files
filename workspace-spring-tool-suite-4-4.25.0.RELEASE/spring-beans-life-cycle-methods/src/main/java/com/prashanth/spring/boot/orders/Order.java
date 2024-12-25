package com.prashanth.spring.boot.orders;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Order implements InitializingBean,DisposableBean{

	private int orderId;
	private String userName;
	private String companyName;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Order()
	{
		System.out.println("Ordrer is Created");
	}
	
	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Bean Life Cycle Method: Initialization :afterPropertiesSet 	");
		this.setCompanyName("Amazon .....");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Bean Life Cycle Method: dispose/destroy :destroy");
	}


	
}
