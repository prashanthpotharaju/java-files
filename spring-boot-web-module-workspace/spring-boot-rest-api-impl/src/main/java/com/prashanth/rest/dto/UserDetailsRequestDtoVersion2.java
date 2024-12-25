package com.prashanth.rest.dto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsRequestDtoVersion2 {

	private String name;
	private String email;
	private String password;
	private long contact;
	
	private AddressDetailsDto address;
}
