package com.prashanth.spring.boot.jpa.relations.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp_address_relations")
public class AddressDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID aid;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private int pinCode;
	
}
