package com.prashanth.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.rest.api.dto.CandidateDetailsDto;
import com.prashanth.rest.api.entity.CandidateDetails;

public interface CandidateInfoRepository extends JpaRepository<CandidateDetails, Integer>{
	
	CandidateDetailsDto findByEmail(String email);

}
