package com.prashanth.rest.header;

import java.net.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class HeaderManagementController {

	//Requirement:As part of User Login RestService
	//where client should send always their hostname as part of Header
	//Request Header:hostname
	
	
	@PostMapping("/candidate/login")
	public ResponseEntity<String> candidateLogin(@RequestBody CandidateLogin candidateLogin,@RequestHeader(name="hostname") String hostname)
	{
		System.out.println("Request Came from the host:"+hostname);
		System.out.println("Login Request:"+candidateLogin);
	
		//TODO -->SERVICE LAYER-->REPOSITORY-->ENTITY
		//TOKEN CREAED ON SUCCESS
		String token="sdfsdjkfhdsjfhdujshjdfjkfhjkfdsfk"+
		"dhfjdshfujhififdjsdfs"+"dsbdsjfdsjfhdsjfdsjf";
		
		org.springframework.http.HttpHeaders responseHeaders=new org.springframework.http.HttpHeaders();
		responseHeaders.add("secret_key",token);
		
		ResponseEntity<String> repsonse=new ResponseEntity<String>("User Login Success",responseHeaders, HttpStatus.OK);
		
		return repsonse;
	}
	
	
}
