package com.example.job_search_system_api.service;

import org.springframework.data.repository.query.Param;

public interface ICandidateRecruitmentService {
    public int addRecruitment(int recruitmentId, int candidateId);
}
