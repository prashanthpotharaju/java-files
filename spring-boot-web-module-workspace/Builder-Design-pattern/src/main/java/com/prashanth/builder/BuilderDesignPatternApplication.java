package com.prashanth.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);
		
		
		//we are confusing assigning the valus to specific property 
		Student student1=new Student(1,"David","david@gmail.com","p1234", null,null,900,89.00);
	    
		System.out.println(student1);
	
		//Builder Design Pattern: here we don't folow the order
		//Student1 Info
		Student s1=Student.builder()
				.email("virat@gmail.com")
				.id(101)
				.name("kohli")
				.build();
	System.out.println(s1);
	
	
	
	//Student2 Info
	Student s2=Student.builder()
			.email("rohit@gmail.com")
			.id(101)
			.name("rohit saharma")
			.gender("Male").avg(90)
			.build();
	System.out.println(s2);
	}

}
