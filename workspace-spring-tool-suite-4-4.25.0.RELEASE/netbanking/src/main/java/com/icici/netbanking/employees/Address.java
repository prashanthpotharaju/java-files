package com.icici.netbanking.employees;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class Address {

	private String city;
	private int pinCode;
	
	public Address()
	{
System.out.println("Address is created....");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
