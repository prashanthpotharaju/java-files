package com.autowired.spring.boot.organization;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int eid;
	private String ename;
	public Employee()
	{
		System.out.println("############Employee Object is Created###############");
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}