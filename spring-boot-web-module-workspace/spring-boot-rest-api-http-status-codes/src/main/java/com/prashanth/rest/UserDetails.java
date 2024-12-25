package com.prashanth.rest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="flipkart_user_details_rest_api_http_status_codes")
public class UserDetails {



	
	private String name;
	@Id
	private String email;
	private String password;
	private long contact;
	private String gender;
	private String city;

	
}
