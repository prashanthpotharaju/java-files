package com.prashanth.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.rest.dto.UserDetailsRequestDto;
import com.prashanth.rest.dto.UserDetailsRequestDtoVersion2;
import com.prashanth.rest.service.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService userManagementService;

	@PostMapping(path="/user/create",consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String userRegistration(@RequestBody UserDetailsRequestDto userDetailsRequestDto)
	{
		System.out.println("Recieved Request Data::::"+userDetailsRequestDto);
		
		//Service Layer
		
		
		return userManagementService.userRegistration(userDetailsRequestDto);
	}
	/*
	 * @PostMapping(path="/user/create/address",consumes=org.springframework.http.
	 * MediaType.APPLICATION_JSON_VALUE,produces=org.springframework.http.MediaType.
	 * APPLICATION_JSON_VALUE) public String
	 * userWithRegistrationAddress(@RequestBody UserDetailsRequestDtoVersion2
	 * userDetailsRequestDtoVersion2) {
	 * System.out.println("Recieved Request Data::::"+userDetailsRequestDtoVersion2)
	 * 
	 * 
	 * //Service Layer
	 * 
	 * 
	 * return userManagementService.userRegistration(userDetailsRequestDtoVersion2);
	 * }
	 */
}
