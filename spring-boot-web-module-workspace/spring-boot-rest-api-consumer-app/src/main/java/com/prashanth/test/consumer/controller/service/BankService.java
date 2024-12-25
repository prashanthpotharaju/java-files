package com.prashanth.test.consumer.controller.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prashanth.test.consumer.controller.BankController;
import com.prashanth.test.consumer.dto.BankDetailsDto;

@Service
public class BankService {

	org.slf4j.Logger logger= LoggerFactory.getLogger(BankService.class);
	
	
	 public String transfer(String user) {
	       // System.out.println("Amount Transferring from " + user + " :Account");
	        
	        ((org.slf4j.Logger) logger).info("Amount Transferring from " + user + " :Account");
	        //System.out.println("Amount transferred from 1234 to 4567 accounts");
	        ((org.slf4j.Logger) logger).info("Amount transferred from 1234 to 4567 accounts");
	        return "Transfer Completed Successfully";
	    }



}
