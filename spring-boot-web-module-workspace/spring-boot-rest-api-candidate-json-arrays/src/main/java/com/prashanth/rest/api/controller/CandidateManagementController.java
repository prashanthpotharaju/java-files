package com.prashanth.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.rest.api.dto.CandidateDetailsDto;
import com.prashanth.rest.api.dto.OrderDetailsDto;
import com.prashanth.rest.api.service.CandidateManagementService;

@RestController
public class CandidateManagementController {

	@Autowired
	CandidateManagementService candidateManagementService;
	
	@PostMapping(path="/candidate/register",
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public String candidateRegister(@RequestBody CandidateDetailsDto candidateDetailsDto )
	{
		System.out.println("Recieved data :"+candidateDetailsDto);
		
		//Service Layer-->Repository
		
		return candidateManagementService.candidateRegister(candidateDetailsDto);
	}
	
	
	
	@PostMapping(path="/order/create"
			)
	public String orderCreate(@RequestBody OrderDetailsDto orderDetailsDto )
	{
		System.out.println("Recieved data :"+orderDetailsDto);
		
		//Service Layer-->Repository
		
		return "Order Created Successfullyy........";
	}
	
	
	
	//PATH VARIABLES
	//LOAD THE CANDIDATE INFO BASEDON emailId:  RETURN 1 OR 0 Object
	//localhost:9999/candidate/david983@gmail.com
	@GetMapping(path="/candidate/{emailId}",
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public CandidateDetailsDto getCandidateData(@PathVariable("emailId") String emailId )
	{
	  System.out.println("Email Id Recieved :"+emailId);
		
		//Service Layer-->Repository
		
		return new CandidateDetailsDto();
	}
	
}
