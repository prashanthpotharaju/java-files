package com.prashanth.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

@Transactional
public interface UserManagementRepository extends JpaRepository<UserDetailsInformation,Integer>{

	
	
	UserDetailsRequestDto  findByEmail(String email);

	List<UserDetailsInformation> findByCityAndGender(String city, String gender);
	    @Transactional
	    void deleteByCity(String city);

		List<UserDetailsInformation> findByCity(String city);


}
