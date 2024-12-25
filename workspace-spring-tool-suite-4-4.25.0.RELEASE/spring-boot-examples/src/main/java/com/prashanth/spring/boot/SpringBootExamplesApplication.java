package com.prashanth.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.prashanth.spring.boot.employees.Employee;

//Conifguration Class we can write the @Bean method to define more than one objects/bean id's
@SpringBootApplication
public class SpringBootExamplesApplication {

	public static void main(String[] args) {
		
		//ApplicationContext container=	SpringApplication.run(SpringBootExamplesApplication.class, args);
		//BeanFactory container=	SpringApplication.run(SpringBootExamplesApplication.class, args);
		//the above two still works
	ConfigurableApplicationContext container=	SpringApplication.run(SpringBootExamplesApplication.class, args);
	Student student1=(Student)container.getBean("student");
	System.out.println("Object id/Bean id 1:"+student1);
	
	Student student2=(Student)container.getBean("student2");
	System.out.println("Object id/Bean id 2:"+student2);
	
	Employee employee1=container.getBean(Employee.class);
	System.out.println("employee Object id/Bean id :"+employee1);
	}

	@Bean("student2")
	public Student getStudentTwo()
	{
		System.out.println("Student 2nd Object is Created....");
		return new Student();
	}
	
}
