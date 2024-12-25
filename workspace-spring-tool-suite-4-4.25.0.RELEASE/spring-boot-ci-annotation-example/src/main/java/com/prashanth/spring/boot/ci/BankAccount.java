package com.prashanth.spring.boot.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {

	private String bankName;
	private String branchName;
	private  long contactNumber;
	private Customer customer;
	public BankAccount()
	{
		System.out.println("########BankAccount is Created ############");
	}
	//constructor injection:autowire=constructor and internally  byType and byName
	//Customer:customerOne,customerTwo
	@Autowired//byName taking 
	public BankAccount(@Qualifier("customerTwo")Customer customer)
	{
		super();
		System.out.println("########Customer Created inside the BankAccount############");
	this.customer=customer;
	}
	
	
	
	
	
	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}

