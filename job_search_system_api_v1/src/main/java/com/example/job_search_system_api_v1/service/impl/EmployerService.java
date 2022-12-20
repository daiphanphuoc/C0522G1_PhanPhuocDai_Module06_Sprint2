package com.example.job_search_system_api_v1.service.impl;

import com.example.job_search_system_api_v1.dto.IEmployerDto;
import com.example.job_search_system_api_v1.repository.IEmployerRepository;
import com.example.job_search_system_api_v1.repository.IUserRepository;
import com.example.job_search_system_api_v1.service.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployerService implements IEmployerService {

    @Autowired
    private IEmployerRepository iEmployerRepository;
//    private IUserRepository iUserRepository;

    @Override
    public Page<IEmployerDto> getAll(Pageable pageable) {
        return null;
//        return iEmployerRepository.searchAll(pageable);
    }
}
