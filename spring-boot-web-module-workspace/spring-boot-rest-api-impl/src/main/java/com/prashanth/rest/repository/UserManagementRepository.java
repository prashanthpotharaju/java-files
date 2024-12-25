package com.prashanth.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.rest.entity.UserDetails;

public interface UserManagementRepository extends JpaRepository<UserDetails,Integer>{

}
