package com.prashanth.spring.boot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanth.spring.boot.jdbc.operations.EmployeeDbOperations;
import com.prashanth.spring.boot.jdbc.operations.NotificationsData;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(SpringJdbcExampleApplication.class, args);
	
	 // System.out.println("=======notifications=========="); 
	 NotificationsData ntd=container.getBean(NotificationsData.class);
	 System.out.println(ntd);
	// System.out.println(ntd.getJdbcTemplate()); 
	 //ntd.addNotificationDetails();
	 ntd.updateByEmpId(101);
	 	
	
    
  //  System.out.println("===============EMPLOYEEEE===============");
  //  ntd.addEmployeeDetails(101, "Virat", "v@gmail.com", 150000);
  // ntd.addEmployeeDetails(102, "Rohit", "r@gmail.com", 250000.00);
   // ntd.addEmployeeDetails(103, "Kl Rahul", "kl@gmail.com", 50000.00);
   // ntd.addEmployeeDetails(104, "R Jadeja", "rjadeja@gmail.com", 170000.00);
   // ntd.addEmployeeDetails(105, "S Gill", "sgill@gmail.com", 80000.00);
   // ntd.addEmployeeDetails(106, "Y Jaishwal", "jaiswal@gmail.com", 90000.00);
    
    //ntd.deleteEmployee(101);
   
 //   ntd.deleteEmployee(102);
    
    EmployeeDbOperations edd=container.getBean(EmployeeDbOperations.class);
    edd.loadAllEmployeeDetails();
    
	
	/*
	 * System.out.println("==============Order Details===========");
	 * OperationsOnOrderDetails
	 * od=container.getBean(OperationsOnOrderDetails.class); System.out.println(od);
	 * od.loadAllOrderDetails();
	 * 
	 * //Load emp by salary
	 * System.out.println("======Employee By salary Filter=========");
	 * edd.loadEmployeeBySalary(80000);
	 */
	}

} 
