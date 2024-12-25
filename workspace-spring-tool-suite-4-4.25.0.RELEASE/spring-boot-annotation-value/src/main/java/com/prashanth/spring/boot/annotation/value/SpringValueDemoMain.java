package com.prashanth.spring.boot.annotation.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringValueDemoMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container =new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
	}

}
