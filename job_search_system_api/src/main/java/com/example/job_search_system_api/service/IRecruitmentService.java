package com.example.job_search_system_api.service;

import com.example.job_search_system_api.dto.IRecruitmentDto;
import com.example.job_search_system_api.dto.IRecruitmentPageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IRecruitmentService {
    Page<IRecruitmentPageDto> searchRecruitment(Pageable pageable);

    Optional<IRecruitmentDto> searchRecruitmentById(@Param("id") int id);
}
