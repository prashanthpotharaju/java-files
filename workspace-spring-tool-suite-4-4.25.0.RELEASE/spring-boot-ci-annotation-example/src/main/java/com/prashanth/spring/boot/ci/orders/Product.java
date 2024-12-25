package com.prashanth.spring.boot.ci.orders;

import org.springframework.stereotype.Component;

@Component("productOne")
public class Product {

	private int pid;
	
	public Product()
	{
		System.out.println("##########Product is Created############");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
}
