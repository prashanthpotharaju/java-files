package com.prashanth.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnersApplication {

	public static void main(String[] args) {
		
	for(int i=0;i<args.length;i++)
	{
		System.out.print(args[i]+"\t");
	}
	System.out.println();
		
		System.out.println("Before Spring context is Ready......");
		SpringApplication.run(SpringBootRunnersApplication.class, args);
	}

}
