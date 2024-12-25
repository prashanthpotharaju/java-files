package com.prashanth.spring.boot.jdbc.operations;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private long emp_id;
	private String ename;
	private String emal;
	private double salary;
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmal() {
		return emal;
	}
	public void setEmal(String emal) {
		this.emal = emal;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", emal=" + emal + ", salary=" + salary + "]";
	}
	
}
