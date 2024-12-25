package com.prashanth.spring.boot.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbDetailsTwoSoftCode {


	//SOFT CODING
	@Value("${db.url}")
	private String url;
	
	@Value("${db.user.name}")
	private String userName;

	@Value("${db.password}")
	private String password;
	
	@Value("23")
	private int noOfConnections;
 
	public DbDetailsTwoSoftCode()
	{
		System.out.println("####################DbDetails IS Created##############");
	}
	 
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getNoOfConnections() {
		return noOfConnections;
	}

	public void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}
	
	
}
