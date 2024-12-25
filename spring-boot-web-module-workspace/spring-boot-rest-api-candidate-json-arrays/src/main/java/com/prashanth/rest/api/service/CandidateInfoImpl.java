package com.prashanth.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.rest.api.dto.CandidateDetailsDto;
import com.prashanth.rest.api.entity.CandidateDetails;
import com.prashanth.rest.api.repository.CandidateInfoRepository;


@Service
public class CandidateInfoImpl implements CandidateManagementService{

	
	@Autowired 
	CandidateInfoRepository candidateInfoRepository;
	
	public CandidateDetailsDto getCandidateInfoByEmail(String email) {

		
		
		return candidateInfoRepository.findByEmail(email);
	}

	@Override
	public String candidateRegister(CandidateDetailsDto  candidateDetailsDto) {

		CandidateDetails details=new CandidateDetails();
		details.setName(candidateDetailsDto.getName());
		details.setEmail(candidateDetailsDto.getEmail());
		details.setContact(candidateDetailsDto.getContact());
		details.setPassword(candidateDetailsDto.getPassword());
		
		
		candidateInfoRepository.save(details);
		
		
		return "Registered suceesssfully......";
	}

	
}
