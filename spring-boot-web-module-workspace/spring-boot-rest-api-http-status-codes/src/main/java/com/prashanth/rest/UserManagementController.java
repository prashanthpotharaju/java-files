package com.prashanth.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.rest.UserDetails;
import com.prashanth.rest.UserDetailsRequestDto;
import com.prashanth.rest.UserManagementService;

@RestController
public class UserManagementController {
    
    @Autowired
    UserManagementService userManagementService;

    @PostMapping(path = "/user/status/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> userRegistration(@RequestBody UserDetailsRequestDto userDetailsRequestDto) {
        System.out.println("Received Request Data::::" + userDetailsRequestDto);
        // Service Layer
        
        
        String response= userManagementService.userRegistration(userDetailsRequestDto);

    	
        if(response!=null)
        {
        	//inserted 
        	//200 Created
        	//User Reigistration Completed .Try Login Now
        	
        	//return new ResponseEntity<String>(response,HttpStatusCode.valueOf(201)); OR WE CAN USE BELOW
        	return new ResponseEntity<String>(response,HttpStatus.CREATED);
        	//response value written in DB SERVICE LAYER
        }
        else//whenever the if(checkEmail.isPresent()){} -->return null
        {
        	//Not Inserted
        	//200 OK 
        	//Email Existed Please Try with New
        	
        return new ResponseEntity<String>("Email Existed Please Try with New",HttpStatus.OK);
        }
    }

    
}
