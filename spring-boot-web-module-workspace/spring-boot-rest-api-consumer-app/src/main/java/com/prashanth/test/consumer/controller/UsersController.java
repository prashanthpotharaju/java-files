package com.prashanth.test.consumer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prashanth.test.consumer.dto.UserRequestConsumerDto;

@RestController
public class UsersController {
	
	
	
	@RequestMapping("/add")
	public String addUser(@RequestBody UserRequestConsumerDto userRequestConsumerDto)
	{
		//TODO:  SERVICE LAYER-->REPOSITORY-->ENTITY
		
		
		/*
		 * Calling Rest Service of Another Application TO CALL REST API REQUIRED INFO
		 * URL: http://localhost:9997/flipkart/user/create 
		 * METHOD: POST 
		 * REQUEST BODY/PAYLOAD :YES
		 *  { 
		 *  "name":"string",
		 *   "email": "string",
		 *    "password": "string",
		 *     "contact": 0, 
		 *     "gender":  "string",
		 *  "city": "string" 
		 *  }
		 *  
		 *  JSON FORMAT DATA OR XML DATA FORMAT DATA ACCEPT
		 *  RESPONSE: STRING DATA TYPE
		 *  CREATE A JAVA CLASS ASSOCIATED TO REQUEST PAYLOAD
		 */
		
		
		/*Hard CODING
		 * UserRequestConsumerDto userData=new UserRequestConsumerDto();
		 * userData.setName("David"); 
		 * userData.setEmail("david@gmail.com");
		 * userData.setPassword("david1234"); 
		 * userData.setContact(991478877);
		 * userData.setCity("New York");
		 *  userData.setGender("Male");
		 */
		
		//HttpEntity<UserRequestConsumerDto> entity=new HttpEntity<UserRequestConsumerDto>(userData);//HardCode
		//Soft Code
		HttpEntity<UserRequestConsumerDto> entity=new HttpEntity<UserRequestConsumerDto>(userRequestConsumerDto);//SoftCode
		
		RestTemplate restTemplate=new RestTemplate();
	ResponseEntity<String> responseEntity=	  restTemplate.exchange("http://localhost:9997/flipkart/user/create",
				HttpMethod.POST, entity, String.class);
		//exchange(URL,METHOD,REQUEST BODY,RESPONSE);
		//restTemplate.postForEntity("http://localhost:9997/flipkart/user/create",entity, String.class); //same as above
		
		String response=responseEntity.getBody();
		
		//Response Details
		System.out.println("Response Body:"+responseEntity.getBody());
		System.out.println("Status Code:"+responseEntity.getStatusCode());
		
		return response;
	}
	
	
	//CALLING ANOTHER  SERVICE WITH QUERY PARAMS
	@RequestMapping("/get/users")
	public List<UserRequestConsumerDto>  getUserInfo()
	{
		//TODO -->SERVICE LAYER-->REPOSITORY-->ENTITY
		
		// URL: http://localhost:9997/flipkart/user/info?city=Hyderabad&gender=Male
		//METHOD: GET
		//No Request Body
		//Response Body
		//[
		//  {
		 //   "userId": 0,
		  //  "name": "string",
		 //   "email": "string",
		   // "password": "string",
		   // "contact": 0,
		    //"gender": "string",
		    //"city": "string"
		 // }
		//]
		//Response  :Array Json
		
		String url="http://localhost:9997/flipkart/user/info?city={cityName}&gender={genderValue}";
		
		//TODO:Pass values Dynamically
		Map<String,String> values=new HashMap<>();
		values.put("cityName", "Chennai");
		values.put("genderValue", "Male");
		
		
		RestTemplate restTemplate=new RestTemplate();
		//restTemplate.exchange("url", null, null, null, null)
		List<UserRequestConsumerDto> users=restTemplate.getForEntity(url, List.class, values).getBody();
		

		System.out.println("Response Body:"+users);
		System.out.println("Status Code:"+restTemplate.getForEntity(url, List.class, values).getStatusCode());
		
		
		
		
		return users;
	}

}
