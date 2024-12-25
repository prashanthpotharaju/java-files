package com.prashanth.rest;

import java.util.List;

public interface UserManagementService {
	
    String userRegistration(UserDetailsRequestDto userDetailsRequestDto);
    //String userRegistration(UserDetailsRequestDtoVersion2 usDetailsRequestDtoVersion2);
public UserDetailsRequestDto getUserInfoByEmail(String emailId);
public List<UserDetailsInformation> getUserInfoByCityAndGender(String city, String gender);
String deleteUserInfoByCity(String city);
List<UserDetailsInformation> getUserInfoByCity(String city);
}
