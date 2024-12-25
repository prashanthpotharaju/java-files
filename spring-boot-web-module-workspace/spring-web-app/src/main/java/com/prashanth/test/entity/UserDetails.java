package com.prashanth.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_details_spring_web")
public class UserDetails {

	private String name;
	@Id
	private String email;
	private String password;
	private String mobileNo;
	
}
