package com.autowired.spring.boot.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Organization {

	
	private int orgId;
	private String orgName;
	//@Qualifier("emp2")
	@Autowired//byName functionality executed if we not specify @Qualifier,@Primary
	private Employee employee;
	
	public Organization()
	{
		System.out.println("*********Organization is Created**************");
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	
}
