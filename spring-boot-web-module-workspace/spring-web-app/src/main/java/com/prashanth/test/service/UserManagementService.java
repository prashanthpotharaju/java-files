package com.prashanth.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.test.entity.UserDetails;
import com.prashanth.test.entity.UserDetailsRepository;

@Service
public class UserManagementService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public UserManagementService()
	{
		System.out.println("Service intsance is created.....");
	}
	
	//Method:taking the data from the Controller
	public String createUser(String name,String email,String password,String contact)
	{
		UserDetails details=new UserDetails();
		details.setName(name);
		details.setEmail(email);
		details.setPassword(password);
		details.setMobileNo(contact);
		
		if(userDetailsRepository.findById(email).isPresent())
		{
			return "Email already existed Try with another email.....";
		}
		else
		{
			userDetailsRepository.save(details);
			return "User Reigistraion successfull.........";
		}
		
		
	}
	
	
	public String getUser(String email)
	{
		if(userDetailsRepository.findById(email).isPresent())
		{
			return "Login Susccessfully...........";
		}
		else
		{
			return "Email not found please register";
		}
	}
	
}
