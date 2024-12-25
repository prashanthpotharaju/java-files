package com.prashanth.rest.api.entity;

import jakarta.annotation.Generated;
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
@Table(name="candidate_info_rest_api")
public class CandidateDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidateId;
	private String name;
	private String email;
	private String password;
	private long contact;
	
}
