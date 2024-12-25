package com.prashanth.rest.api.dto;

import lombok.Data;

@Data
public class AddressDetailsDto {

	private String area;
	private String city;
	private String state;
	private int pincode;
	
}
