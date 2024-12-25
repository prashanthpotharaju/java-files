package com.prashanth.spring.boot.jdbc.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NotificationsData {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addNotificationDetails()
	{
		String insertQuery=
		 "insert into notifications values('TEXT','9912473952','Mobile Number');";
		jdbcTemplate.update(insertQuery);
	System.out.println("One Record is Inserted NOTIFICATIONS Successfullyy..........");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//adding employee details:insert
	//positional parameters:passing the values dynamically
	public void addEmployeeDetails(long empId,String ename,String email,double salary)
	{
		String insertEmp="insert into EmployeeJdbc values(?,?,?,?)";
		
		//setting  values to positions
		//follow the order
		jdbcTemplate.update(insertEmp,empId,ename,email,salary);
		System.out.println("Record is Inserted into Employee successfully.........");
	}
	//delete the employee record based on the empId
	public void deleteEmployee(long empId)
	{
		String deleteQuery="delete from EmployeeJdbc where emp_id=?";
		//setting the positional parameters
		jdbcTemplate.update(deleteQuery,empId);
		System.out.println("Employee id Deleted Successfully..............");
	}
	
	//update the employee details by empid
	public void updateByEmpId(int empId )
	{
		
		String updateQuery="update employeejdbc set ename='P prashanth' where emp_id=?";
		
		jdbcTemplate.update(updateQuery,empId);
		
		
		
	}
	
}
