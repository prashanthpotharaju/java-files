package com.prashanth.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public  class UserManagementServiceImpl implements UserManagementService,UserDetailsService {

    @Autowired
    UserManagementRepository userManagementRepository;
    
	
    public String userRegistration(UserDetailsRequestDto userDetailsRequestDto) {
    	
    	
    	
        // Create entity object and set data
    	UserDetailsInformation userDetails = new UserDetailsInformation();
        userDetails.setName(userDetailsRequestDto.getName());
        userDetails.setEmail(userDetailsRequestDto.getEmail());
        userDetails.setPassword(userDetailsRequestDto.getPassword());
        userDetails.setContact(userDetailsRequestDto.getContact());
        userDetails.setGender(userDetailsRequestDto.getGender());
        userDetails.setCity(userDetailsRequestDto.getCity());

        // Save user details to the repository
        userManagementRepository.save(userDetails);

        // Return success message with user ID
        return "User Registration Success, Please Login with user Id: " + userDetails.getUserId();
    }


	@Override
	public UserDetailsRequestDto getUserInfoByEmail(String email) {

		
		return userManagementRepository.findByEmail(email);
	}


	@Override
	public List<UserDetailsInformation> getUserInfoByCityAndGender(String city, String gender) {
		
		
		
		return userManagementRepository.findByCityAndGender(city,gender);
	}


	@Override
	public String deleteUserInfoByCity(String city) {
	    userManagementRepository.deleteByCity(city);
	    return "Deleted Users Info for City: " + city + " successfully.";
	}


	@Override
	public List<UserDetailsInformation> getUserInfoByCity(String city) {

		return userManagementRepository.findByCity( city);
	}


	@Override//unimplemeneted ,ethod
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

		  Integer userIdAsInteger = Integer.parseInt(userId);
		
		UserDetailsInformation userDetailsInformation = userManagementRepository.findById(userIdAsInteger)
		        .orElseThrow(() -> new UsernameNotFoundException("UserId not available, please try with another userId: " + userId));
		    		 
		 return null;
	}

	
}
