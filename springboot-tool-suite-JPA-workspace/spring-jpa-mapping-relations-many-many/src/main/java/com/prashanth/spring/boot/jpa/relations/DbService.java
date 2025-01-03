package com.prashanth.spring.boot.jpa.relations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prashanth.spring.boot.jpa.relations.entity.EmployeeDetails;
import com.prashanth.spring.boot.jpa.relations.entity.Roles;
import com.prashanth.spring.boot.jpa.relations.entity.repository.EmployeeRepository;
import com.prashanth.spring.boot.jpa.relations.entity.repository.RolesRepository;

@Component
public class DbService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RolesRepository rolesRepository;
	
	public void addEmployee()
	{
		Roles r1=new Roles();
		r1.setRoleId(101);
		r1.setRoleName("DEVELOPER");
		
		Roles r2=new Roles();
		r2.setRoleId(102);
		r2.setRoleName("QA");
		
		Roles r3=new Roles();
		r3.setRoleId(103);
		r3.setRoleName("SUPPORT");
		
		rolesRepository.save(r1);
		rolesRepository.save(r2);
		rolesRepository.save(r3);
		
		System.out.println("========================");
		
		EmployeeDetails e1=new EmployeeDetails();
		e1.setEmpName("DAVID");
		e1.setEmail("david@gmail.com");
		e1.setGender("Male");
		e1.setRoles(List.of(r1,r2));
		
		System.out.println("###################################");
		
		EmployeeDetails e2=new EmployeeDetails();
		e2.setEmpName("Mahesh");
		e2.setEmail("babu@gmail.com");
		e2.setGender("Male");
		e2.setRoles(List.of(r2,r3));
		System.out.println("**********************************************************");
		
		EmployeeDetails e3=new EmployeeDetails();
		e3.setEmpName("Hardik");
		e3.setEmail("pandia@gmail.com");
		e3.setGender("Male");
		e3.setRoles(List.of(r1,r3,r2));
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		employeeRepository.save(e1);
		System.out.println("222222222222222222222222222222222222222222222222");
		employeeRepository.save(e2);
		System.out.println("7777777777777777777777777777777777");
		employeeRepository.save(e3);
		System.out.println("9999999999999999999999999999999");
	}
	
	
}
