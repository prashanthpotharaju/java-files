package com.prashanth.spring.boot.jpa.relations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="department_many_to_one")
public class Departments {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	
	private String deptName;
	
}
