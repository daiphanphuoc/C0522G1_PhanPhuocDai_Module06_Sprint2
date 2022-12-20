package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.repository.ICandidateRepository;
import com.example.job_search_system_api.service.ICandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService implements ICandidateService {

    @Autowired
    private ICandidateRepository candidateRepository;
    @Override
    public int getIdCandidate(String username) {
        return candidateRepository.getIdCandidate(username).orElse(0);
    }
}
