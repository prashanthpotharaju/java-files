package com.prashanth.rest;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsRequestDto {

	private String name;
	private String email;
	private String password;
	private long contact;
	private String gender;
	private String city;

}
