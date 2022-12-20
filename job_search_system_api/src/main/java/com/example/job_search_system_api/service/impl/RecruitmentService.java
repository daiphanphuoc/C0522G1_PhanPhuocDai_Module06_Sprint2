package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.dto.IRecruitmentDto;
import com.example.job_search_system_api.dto.IRecruitmentPageDto;
import com.example.job_search_system_api.repository.IRecruitmentRepository;
import com.example.job_search_system_api.service.IRecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecruitmentService  implements IRecruitmentService {

    @Autowired
    private IRecruitmentRepository recruitmentRepository;
    public Page<IRecruitmentPageDto> searchRecruitment(Pageable pageable){
        return  recruitmentRepository.searchRecruitment(pageable);
    }

    @Override
    public Optional<IRecruitmentDto> searchRecruitmentById(int id) {
        return recruitmentRepository.searchRecruitmentById(id);
    }
}
