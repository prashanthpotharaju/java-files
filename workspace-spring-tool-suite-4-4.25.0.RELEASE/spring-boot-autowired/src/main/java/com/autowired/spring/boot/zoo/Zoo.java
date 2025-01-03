package com.autowired.spring.boot.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	public Zoo()
	{
		System.out.println("ZOO Object is Created.....");
	}
	
	
	@Qualifier("lion")
	@Autowired
	private Animal animal;
	
	/* if not speicy lion is the defualt
	 * @Autowired private Animal lion;
	 */
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
