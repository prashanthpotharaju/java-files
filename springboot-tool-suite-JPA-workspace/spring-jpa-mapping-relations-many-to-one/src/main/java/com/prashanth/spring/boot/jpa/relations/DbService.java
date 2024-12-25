package com.prashanth.spring.boot.jpa.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prashanth.spring.boot.jpa.relations.entity.Departments;
import com.prashanth.spring.boot.jpa.relations.entity.EmployeeDetails;
import com.prashanth.spring.boot.jpa.relations.entity.repository.DepartmentsRepository;
import com.prashanth.spring.boot.jpa.relations.entity.repository.EmployeeRepository;

@Component
public class DbService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentsRepository departmentRepository;

    public void addEmpInfo() {
        // Save departments first
        Departments dp1 = new Departments();
        dp1.setDeptName("DATABASE");

        Departments dp2 = new Departments();
        dp2.setDeptName("AWS");

        Departments dp3 = new Departments();
        dp3.setDeptName("QA TESTING");

        dp1 = departmentRepository.save(dp1);
        dp2 = departmentRepository.save(dp2);
        dp3 = departmentRepository.save(dp3);

        // Create and associate employees with departments
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setEmpName("Prashanth Varma");
        emp1.setEmail("prashanth@gmail.com");
        emp1.setGender("Male");
        emp1.setDepartments(dp1);

        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.setEmpName("Virat Kohli");
        emp2.setEmail("virat@gmail.com");
        emp2.setGender("Male");
        emp2.setDepartments(dp1);

        EmployeeDetails emp3 = new EmployeeDetails();
        emp3.setEmpName("Rohit Sharma");
        emp3.setEmail("rohit@gmail.com");
        emp3.setGender("Male");
        emp3.setDepartments(dp2);

        employeeRepository.save(emp1);
        employeeRepository.save(emp2);
        employeeRepository.save(emp3);
    }
}
