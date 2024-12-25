package com.prashanth.rest.api.dto;

import java.util.List;

import lombok.Data;

@Data
public class CandidateDetailsDto {

	
	private String name;
	private String  email;
	private String password;
	private long contact;
	
	private AddressDetailsDto address;
	private 	List<EducationDetailsDto> educationData;
}
