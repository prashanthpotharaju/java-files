package com.prashanth.test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.test.jwt.JWTTokenManager;

@RestController
public class JwtController {

	@Autowired
	JWTTokenManager jwtTokenManager;
	
	@GetMapping("/create/token/{userId}")
	public String createToken(@PathVariable String userId)
	{
		
		return jwtTokenManager.createToken(userId);
	}
	
	//Testing Token
	@GetMapping("/validate/token/{userId}")
	public boolean isValidToken(@PathVariable String  userId,@RequestHeader String token)
	{
		return jwtTokenManager.isValidToken(userId, token);
	}
	
}
