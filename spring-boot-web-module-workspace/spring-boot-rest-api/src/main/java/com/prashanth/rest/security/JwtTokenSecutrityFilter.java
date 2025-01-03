package com.prashanth.rest.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.prashanth.rest.JWTTokenManager;
import com.prashanth.rest.UserManagementServiceImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class JwtTokenSecutrityFilter extends OncePerRequestFilter{

	@Autowired
	UserManagementServiceImpl userManagementServiceImpl;
	
	@Autowired
    JWTTokenManager jwtTokenManager;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		//validating Tokens
	String token=	request.getHeader("Authorized");
	
	//Token is null or not
	//token is null:token is missing ,Unauthorized 
	//token is not null : get the user name from token, then validate with login user id
	
	String userNameOfToken=null;
	if(token!=null)
	{
		//from the token reading username
		userNameOfToken=jwtTokenManager.getUserOfToken(token);
	}
	else
	{
		System.out.println("Token is Missing ");
		throw new RuntimeException("Token is missing  ,UnAuthorized Request");
		
	}
	
	//both are matching send user id to DB
		//NOT MATCHING :UNAUTHORIZED ACCESS
			
	if((userNameOfToken!=null) && SecurityContextHolder.getContext().getAuthentication()!=null)
	{
		//user details from DB
	UserDetails userDetails=	userManagementServiceImpl.loadUserByUsername(userNameOfToken);
	//verify Token is valid  w.r.to time and username
		boolean isTokenValid=jwtTokenManager.isValidToken(userDetails.getUsername(), userNameOfToken);
		
		if(isTokenValid)
		{
			//SET SECURITY CONTEXT OF USER  AS SUCCESS
			// TOKEN CLASS
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
					new UsernamePasswordAuthenticationToken(  userDetails.getUsername(),null,null);
			
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			
			
			
		}
		else
		{
			//Handle logic when token is not valid 
			
			System.out.println("Token is Ivalid or Details  are  not avaible in DB WITH USERNAME ");
			System.out.println(isTokenValid);
			System.out.println(userDetails);
		
		}
		
	}
	else
	{
		
	}
	
	filterChain.doFilter(request, response);
	}

}
