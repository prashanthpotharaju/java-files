package com.prashanth.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    UserManagementRepository userManagementRepository;
    
	
    public String userRegistration(UserDetailsRequestDto userDetailsRequestDto) {
    
    	//Check the email from the DB from UserDetailsRequestDto
    Optional<UserDetails> checkEmail=	userManagementRepository.findById(userDetailsRequestDto.getEmail());
   
    if(checkEmail.isPresent())
    {
    	
    	//return "Email Is Already Existed Please Tri With Another one:"+userDetailsRequestDto.getEmail();
    return null;
    }else
    {
    	
        // Create entity object and set data
        UserDetails userDetails = new UserDetails();
        userDetails.setName(userDetailsRequestDto.getName());
        userDetails.setEmail(userDetailsRequestDto.getEmail());
        userDetails.setPassword(userDetailsRequestDto.getPassword());
        userDetails.setContact(userDetailsRequestDto.getContact());
        userDetails.setGender(userDetailsRequestDto.getGender());
        userDetails.setCity(userDetailsRequestDto.getCity());

        // Save user details to the repository
        userManagementRepository.save(userDetails);

        // Return success message with user ID
        return "User Registration Success, Please Login with user Id: " + userDetails.getEmail();
    }
    }

}
