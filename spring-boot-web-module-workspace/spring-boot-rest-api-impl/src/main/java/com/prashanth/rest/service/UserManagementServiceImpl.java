package com.prashanth.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.rest.dto.UserDetailsRequestDto;
//import com.prashanth.rest.dto.UserDetailsRequestDtoVersion2;
import com.prashanth.rest.entity.UserDetails;
//import com.prashanth.rest.entity.UserDetailsWithAdress;
import com.prashanth.rest.repository.UserManagementRepository;
//import com.prashanth.rest.repository.UserWithAddressRepsitory;

@Service
public  class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    UserManagementRepository userManagementRepository;
    
	/*
	 * @Autowired UserWithAddressRepsitory userWithAddressRepsitory;
	 */
    @Override
    public String userRegistration(UserDetailsRequestDto userDetailsRequestDto) {
        // Create entity object and set data
        UserDetails userDetails = new UserDetails();
        userDetails.setName(userDetailsRequestDto.getName());
        userDetails.setEmail(userDetailsRequestDto.getEmail());
        userDetails.setPassword(userDetailsRequestDto.getPassword());
        userDetails.setContact(userDetailsRequestDto.getContact());

        // Save user details to the repository
        userManagementRepository.save(userDetails);

        // Return success message with user ID
        return "User Registration Success, Please Login with user Id: " + userDetails.getUserId();
    }

	/*
	 * @Override public String userRegistration(UserDetailsRequestDtoVersion2
	 * usDetailsRequestDtoVersion2) {
	 * 
	 * UserDetailsWithAdress data=new UserDetailsWithAdress();
	 * data.setName(usDetailsRequestDtoVersion2.getName());
	 * data.setEmail(usDetailsRequestDtoVersion2.getEmail());
	 * data.setPassword(usDetailsRequestDtoVersion2.getPassword());
	 * data.setContact(usDetailsRequestDtoVersion2.getContact());
	 * data.setArea(UserDetailsRequestDtoVersion2.get);
	 * 
	 * userManagementRepository.save(data); return null; }
	 */
}
