package com.prashanth.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.rest.UserDetailsInformation;
import com.prashanth.rest.UserDetailsRequestDto;
import com.prashanth.rest.UserManagementService;

@RestController
public class UserManagementController {
    
    @Autowired
    UserManagementService userManagementService;

    @PostMapping(path = "/user/create", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public String userRegistration(@RequestBody UserDetailsRequestDto userDetailsRequestDto) {
        System.out.println("Received Request Data::::" + userDetailsRequestDto);
        // Service Layer
        return userManagementService.userRegistration(userDetailsRequestDto);
    }

    // PATH VARIABLES
    // LOAD THE CANDIDATE INFO BASED ON emailId: RETURN 1 OR 0 Object
    // localhost:9999/user/david983@gmail.com
    @GetMapping(path = "/user/{emailId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDetailsRequestDto getUserDataByEmail(@PathVariable("emailId") String emailId) {
        System.out.println("Email Id Received :" + emailId);
        // Service Layer-->Repository
        return userManagementService.getUserInfoByEmail(emailId);
    }
    
    
    
    //Getting the userinfo By Gender and City
    //localhost:9997/flipkart/hyderabad/male
    @GetMapping(path="/user/{city}/{gender}")
    public List<UserDetailsInformation> getUserInfoByCityAndGender(@PathVariable("city") String  city,@PathVariable("gender") String gender)
    {
    	
    	System.out.println("Fetching userInfo By Gender :"+gender+" ,City:"+city);
    	//Service Layer -->Repository Layer -->DB
    	return userManagementService.getUserInfoByCityAndGender(city,gender);
    }
    
  //IMPLEMENT DELETE USER BASED ON CITY
    
    @DeleteMapping(path="/delete/{city}")
    public String deleteUserInfoByCity(@PathVariable(name="city") String  city)
    {
    	
    	System.out.println("DELETE userInfo By City:"+city);
    	//Service Layer -->Repository Layer -->DB
    	 userManagementService.deleteUserInfoByCity(city);
    	 return "Deleted Users Info For City:"+city;
    }
    
    //QUERYPARAMETERS OR QUERY STRING 
    //Get Users Based on city and gender
    //localhost:9997/flipkart/user/info?city=Hyderabad&gender=Male
    @GetMapping(path="/user/info")
    public List<UserDetailsInformation> getUsersInfoByCityAndGender(
    		@RequestParam(name="city") String  city,
    		@RequestParam(name="gender") String gender)
    {
    	
    	System.out.println("Fetching userInfo for QUERYPARAMETER/QUERY STRING  By Gender :"+gender+" ,City:"+city);
    	//Service Layer -->Repository Layer -->DB
    	if(gender.equalsIgnoreCase("MALE")|| gender.equalsIgnoreCase("FEMALE"))
    	{
    	return userManagementService.getUserInfoByCityAndGender(city,gender);
    }else
    {
    	return null;
    }
    	}
    
    
    //REQ:Get user data based on city always--mandatory means use Path variable--@PathVariable(name="city")
     //when user clicked on gender check box (filter)
    //if gender is presented then get data city and gender--optional then use Query parameter--@RequestParam(name="gender",required =false) 
    //if gender is not presemted then get data city.
    @GetMapping(path="/user/info/{city}")
    public List<UserDetailsInformation> getUserssInfoByCityAndGender(
    		@PathVariable(name="city") String  city,
    		@RequestParam(name="gender",required =false) String gender)
    {
    	
    	System.out.println("Fetching userInfo for   By Gender :"+gender+" ,City:"+city);
    	//Service Layer -->Repository Layer -->DB
    	if(gender!=null) {
    	return userManagementService.getUserInfoByCityAndGender(city,gender);
    }
    	else
    	{
    		return  userManagementService.getUserInfoByCity(city);
    	}
    	
    }
    
    
    
    

    
    
    //TODO :Assignments
    //IMPLEMENT DELETE USER BASED ON EMAILID
    //IMPLEMENT DELETE USER BASED ON GENDER
    //IMPLEMENT UPDATE USER BASED ON EMAILID
    
    
    
    
    
    
    
    
}
