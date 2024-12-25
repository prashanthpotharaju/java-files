package com.prashanth.rest.service;

import com.prashanth.rest.dto.UserDetailsRequestDto;
//import com.prashanth.rest.dto.UserDetailsRequestDtoVersion2;

public interface UserManagementService {
	
    String userRegistration(UserDetailsRequestDto userDetailsRequestDto);
    //String userRegistration(UserDetailsRequestDtoVersion2 usDetailsRequestDtoVersion2);
}
