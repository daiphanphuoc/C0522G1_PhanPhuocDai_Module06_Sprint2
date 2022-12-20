package com.example.job_search_system_api_v1.service;

import com.example.job_search_system_api_v1.dto.IEmployerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployerService  {
    Page<IEmployerDto> getAll(Pageable pageable);
}
