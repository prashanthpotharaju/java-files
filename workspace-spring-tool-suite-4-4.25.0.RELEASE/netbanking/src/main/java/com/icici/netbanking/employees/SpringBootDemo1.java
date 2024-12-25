package com.icici.netbanking.employees;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootDemo1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
	//C:\Users\prashanth.potharaju\Documents\workspace-spring-tool-suite-4-4.25.0.RELEASE\netbanking\src\main\resources\beans.xml 
	//this is valid for particular one system or computer 
 // if  we want use any where then use beans.xml in SpringBoot
		
		
	}

}
