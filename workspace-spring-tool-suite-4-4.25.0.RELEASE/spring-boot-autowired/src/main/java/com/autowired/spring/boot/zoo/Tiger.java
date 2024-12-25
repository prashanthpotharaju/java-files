package com.autowired.spring.boot.zoo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class Tiger implements Animal{

	public Tiger()
	{
		System.out.println("######Tiger is Created#######");
	}

	@Override
	public int getCountOFAnimal(String name) {
		System.out.println(17+"  Tigers avaialble....");
		return 17;
	}

	@Override
	public void getNameOfAnimal() {
		System.out.println("This is Tiger........");
		
	}
}
