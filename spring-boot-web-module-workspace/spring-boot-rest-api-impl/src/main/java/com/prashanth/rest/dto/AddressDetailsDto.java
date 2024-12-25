package com.prashanth.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDetailsDto {

	private String area;
	private String city;
	private String state;
	private Integer pincode;
	
}
