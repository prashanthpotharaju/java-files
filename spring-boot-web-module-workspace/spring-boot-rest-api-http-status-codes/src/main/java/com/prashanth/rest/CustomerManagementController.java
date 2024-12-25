package com.prashanth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CustomerManagementController {

	  
    @Autowired
    UserManagementService userManagementService;

    @PostMapping(path = "/customer/create")
    public ResponseEntity<String> userRegistration(@Valid @RequestBody CustomerDetailsRequestDto customerDetailsRequestDto) {
        System.out.println("Received Request Data::::" + customerDetailsRequestDto);
       
        // Service Layer-->Repository
        //TODO
       // userManagementService.userRegistration(customerDetailsRequestDto);

        return new ResponseEntity<String>("Email Existed Please Try with New",HttpStatus.OK);
        
    }
}
