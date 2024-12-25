package com.icici.netbanking.employees;

public class Employee {

	private Address address;
	
	private int eid;
	private String ename;
	
	public Employee()
	{
		System.out.println("Employee is Created....");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address is created inside the Employee....");
		this.address = address;
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
