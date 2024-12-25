package com.prashanth.spring.boot.jdbc.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDbOperations {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
   public void loadAllEmployeeDetails()
   {
	   String querySelect="select * from EmployeeJdbc";
	//after executing the select query ,once getting ResultSet ,please 
//map RS data to list of objects belongs to  type Employee
	   
	   List<Employee> listEmp =   jdbcTemplate.query(querySelect,new BeanPropertyRowMapper<Employee>(Employee.class));
	
	System.out.println("Records Are Fetchedddd.................");
	listEmp.stream().forEach(System.out::println);
	   
   }
	
   //postional parameters
   //load employee info  based on the salary
	public void loadEmployeeBySalary(float salary)
	{
		String loadBySalary="select * from EmployeeJdbc where salary=?";
		List<Employee> listOfEmpBySal=jdbcTemplate.query(loadBySalary,
				new BeanPropertyRowMapper<Employee>(Employee.class),
				salary
				);
				
		listOfEmpBySal.stream().forEach(System.out::println);
     		
	}
   
   
	
	
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
}
