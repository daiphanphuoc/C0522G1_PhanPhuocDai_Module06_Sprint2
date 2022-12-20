package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.repository.ICandidateRecruitmentRepository;
import com.example.job_search_system_api.service.ICandidateRecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateRecruitmentService implements ICandidateRecruitmentService {
    @Autowired
    private ICandidateRecruitmentRepository candidateRecruitmentRepository;
    @Override
    public int addRecruitment(int recruitmentId, int candidateId) {
        return candidateRecruitmentRepository.addRecruitment(recruitmentId,candidateId);
    }
}
