package com.prashanth.test.jwt;

import java.sql.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTTokenManager {

	private final String  SECRET_KEY="prashanthviratkohlirohitgoat";
	
	private long expireTimeInMilliSeconds=5*60*1000;
	
	
	//Creating Token
	public String createToken(String userId)
	{
		//using Builder Design pattern
String token=
        Jwts.builder().
		setSubject(userId).
		setIssuedAt(new Date(System.currentTimeMillis())).
		setExpiration(new Date(System.currentTimeMillis()+expireTimeInMilliSeconds)).
		signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
		
		
		
		return token;
	}
	
	
	
	//Validation Token
	//1.Requested user id matching  with userid  of Token
	//  UserId: virat
	//TOKEN AVAILABLE OT NOT:
	             //NO:UNAUTORIZED
	//token created for userId:eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXJhdCIsImlhdCI6MTczMDQzNDc1OCwiZXhwIjoxNzMwNDM1MDU4fQ.ltCeZYjinbEqkNKStt370A-TFPjc9qYxOsx3kFCcYwA
	//decrypt the token
	//case:1 :: then will get the userId: virat
	//Token is valid 
         	//-->verify the time
	          //time with in the range OR NOT ? :True : VALID
	
	//case:2 :: then if i will get the userId: rohit
		//Token is Invalid -->no need to verify the time
	
	
	//Get UserId from the Token
	//I/p : Requested User Id , Token 
	//Read User from the above token
	public boolean isValidationOfUserId(String loginUserId,String token)
	{
	String tokenUserId=	Jwts.parser()
		.setSigningKey(SECRET_KEY)
		.parseClaimsJws(token)//handle exceptions here
		.getBody()
		.getSubject();
	System.out.println("Login UseriD:"+loginUserId);
	System.out.println("Token got:"+ token);
	System.out.println("Token User Id:"+tokenUserId);
	
	return loginUserId.equalsIgnoreCase(tokenUserId);
	}
	
	//Id Token Time  Valid or Not?
	//I/p:Token
	
	public boolean isTokenTimeValid(String token)
	{
		java.util.Date expiryTime=
				Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getExpiration();
		
		//08:35 to 08:40 --->time valid for 5 minutes
		//start time:   08:35
		//expireTime:   08:40
		//Recieved Request at 08:39 then true
		//Recieved Request at 08:43 the false
		
		System.out.println("Token Expiry Time:"+expiryTime);
		System.out.println("Request Recived Curretnt Time:"+new java.util.Date());
		boolean isExpired=expiryTime.after(new java.util.Date());
		return isExpired;
	}
	
	//is Valid Token or not?
	// userid and time validity: true
	//I/p:  login userId, token
	public boolean isValidToken(String loginUserId,String token)
	{
		
		
		
		return isValidationOfUserId(loginUserId, token) && isTokenTimeValid(token);
	}
	
}
