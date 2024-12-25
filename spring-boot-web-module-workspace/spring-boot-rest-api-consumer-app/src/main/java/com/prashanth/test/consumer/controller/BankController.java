package com.prashanth.test.consumer.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.test.consumer.controller.service.BankService;
import com.prashanth.test.consumer.dto.BankDetailsDto;

@RestController
public class BankController {

	
	@Autowired
	BankService bankService;
	//Loggging example
	
	org.slf4j.Logger logger= LoggerFactory.getLogger(BankController.class);
	
    @PostMapping(path = "/bank/login")
    public ResponseEntity<String> userRegistration(@RequestBody BankDetailsDto bankDetailsDto) {
        //System.out.println("Bank Login Received Data: " + bankDetailsDto);
         logger.info("Bank Login Received Data: " + bankDetailsDto);
         logger.error("Bank Login Received Data: " + bankDetailsDto);
         logger.debug("Bank Login Received Data: " + bankDetailsDto);
         logger.trace("Bank Login Received Data: " + bankDetailsDto);
         logger.warn("Bank Login Received Data: " + bankDetailsDto);
         
       //  bankService.transfer(bankDetailsDto.getEmail());
        transfer(bankDetailsDto.getEmail());
        
        // TODO --> SERVICE LAYER -->REPOSITORY-->ENTITY
        return new ResponseEntity<String>("Login and Transfer Completed", HttpStatus.CREATED);
    }

    private String transfer(String user) {
       // System.out.println("Amount Transferring from " + user + " :Account");
        
        ((org.slf4j.Logger) logger).info("Amount Transferring from " + user + " :Account");
        //System.out.println("Amount transferred from 1234 to 4567 accounts");
        ((org.slf4j.Logger) logger).info("Amount transferred from 1234 to 4567 accounts");
        return "Transfer Completed Successfully";
    }
}
