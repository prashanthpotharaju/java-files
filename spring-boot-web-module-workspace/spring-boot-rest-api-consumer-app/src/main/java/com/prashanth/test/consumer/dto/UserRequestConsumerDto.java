package com.prashanth.test.consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestConsumerDto {

	
	/* { 
		   "name":"string",
		    "email": "string",
		    "password": "string",
		      "contact": 0, 
		      "gender":  "string",
		   "city": "string" 
		   }*/
	
	private String name;
	private String email;
	private String password;
	private long contact;
	private String city;
	private String gender;
	
	
}
