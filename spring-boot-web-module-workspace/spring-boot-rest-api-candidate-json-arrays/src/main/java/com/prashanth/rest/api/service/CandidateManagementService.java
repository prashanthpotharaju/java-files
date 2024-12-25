package com.prashanth.rest.api.service;

import com.prashanth.rest.api.dto.CandidateDetailsDto;

public interface CandidateManagementService {

	CandidateDetailsDto getCandidateInfoByEmail(String email);
	String candidateRegister(CandidateDetailsDto candidateDetailsDto);
}
