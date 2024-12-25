package com.prashanth.spring.boot.ci;

import org.springframework.stereotype.Component;

@Component("customerOne")
public class Customer {

	private String name;
	private long contact;
	
	public Customer()
	{
		System.out.println("###########Customer is Created#########");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
}
