package com.prashanth.spring.boot.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbDetailsHardCode {

	//Hard Coding 
	//so it's  reccomended to use the configuration data in the application properties files
	
	@Value("localhost:1521")
	private String url;
	
	@Value("Prashanth")
	private String userName;

	@Value("P1234")
	private String password;
	
	@Value("23")
	private int noOfConnections;
 
	public DbDetailsHardCode()
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
