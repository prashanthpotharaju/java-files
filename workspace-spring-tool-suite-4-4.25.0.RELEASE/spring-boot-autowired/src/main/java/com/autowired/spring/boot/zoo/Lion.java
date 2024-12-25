package com.autowired.spring.boot.zoo;

import org.springframework.stereotype.Component;

@Component("lion")
public class Lion implements Animal{

	public Lion()
	{
		System.out.println("Lion is Added........");
	}
	
	@Override
	public int getCountOFAnimal(String name) {
 int count=56;
 System.out.println(count+"  Lions are Available");
		return count;
	}

	@Override
	public void getNameOfAnimal() {
		System.out.println("=====This is Lion======");
		
	}

}
