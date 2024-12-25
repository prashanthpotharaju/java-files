package com.autowired.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.autowired.spring.boot.organization.Employee;
import com.autowired.spring.boot.organization.Organization;
import com.autowired.spring.boot.zoo.Animal;
import com.autowired.spring.boot.zoo.Lion;
import com.autowired.spring.boot.zoo.Zoo;

@SpringBootApplication
public class SpringBootAutowiredApplication {

	public static void main(String[] args) {
	ApplicationContext container=	SpringApplication.run(SpringBootAutowiredApplication.class, args);
	Organization org=container.getBean(Organization.class);
	
	System.out.println("Org bean id:"+org);
	System.out.println("Employee bean id inside org:"+org.getEmployee());
	
	Employee emp1=(Employee)container.getBean("employee");
System.out.println("Employee bean id1:"+emp1);

Employee emp2=(Employee)container.getBean("emp2");
System.out.println("Employee bean id2:"+emp2);


System.out.println("=====================Animals============================");
Zoo zoo=container.getBean(Zoo.class);
System.out.println("zoo bean id:"+zoo);
System.out.println("lion bean id inside the Animal:"+zoo.getAnimal());
System.out.println("###############");
Animal lion=container.getBean(Lion.class);
System.out.println(lion);

/*
 * Animal tiger=container.getBean(Animal.class); System.out.println(tiger);
 */
	}
	
	

}
