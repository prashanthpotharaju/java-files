package com.prashanth.rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class APISecurityConfiguration {
	
	
	//REFER THE NOTES
	
	@Bean
	SecurityFilterChain httpSecurity(HttpSecurity httpSecurity)
	{
		//Configure the Rules 
		httpSecurity.csrf
		
		
		return null;
		
	}

}
