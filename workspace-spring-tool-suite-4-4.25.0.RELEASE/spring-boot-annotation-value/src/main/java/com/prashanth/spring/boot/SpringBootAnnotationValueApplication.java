package com.prashanth.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanth.spring.boot.annotation.value.DbDetailsHardCode;
import com.prashanth.spring.boot.annotation.value.DbDetailsTwoSoftCode;

@SpringBootApplication
public class SpringBootAnnotationValueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=	SpringApplication.run(SpringBootAnnotationValueApplication.class, args);
	
		DbDetailsHardCode dbData=container.getBean(DbDetailsHardCode.class);
	System.out.println("===================DB DETAILS HARD CODING=============");
		System.out.println(dbData);
	System.out.println("URL:"+dbData.getUrl());
	System.out.println("USERNAME:"+dbData.getUserName());
	System.out.println("PASSWORD:"+dbData.getPassword());
	System.out.println(dbData.getNoOfConnections()+"  connections found.....");
	
	System.out.println("=============DB DETAILS SOFT CODING============");
	DbDetailsTwoSoftCode dbData2=container.getBean(DbDetailsTwoSoftCode.class);
	System.out.println(dbData2);
	System.out.println("URL:"+dbData2.getUrl());
	System.out.println("USERNAME:"+dbData2.getUserName());
	System.out.println("PASSWORD:"+dbData2.getPassword());
	System.out.println(dbData2.getNoOfConnections()+"  connections found.....");
	}

}
