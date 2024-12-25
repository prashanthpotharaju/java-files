package com.prashanth.rest.api.dto;

import lombok.Data;

@Data 
public class EducationDetailsDto {

	
	private String standard;
	private String nameOfOrg;
	private  int passedYear;
	private double avgPercentage;
}
