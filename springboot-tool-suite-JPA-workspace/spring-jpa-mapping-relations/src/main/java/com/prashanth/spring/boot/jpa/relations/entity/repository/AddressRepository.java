package com.prashanth.spring.boot.jpa.relations.entity.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.spring.boot.jpa.relations.entity.AddressDetails;

public interface AddressRepository extends JpaRepository<AddressDetails, UUID>{

}
