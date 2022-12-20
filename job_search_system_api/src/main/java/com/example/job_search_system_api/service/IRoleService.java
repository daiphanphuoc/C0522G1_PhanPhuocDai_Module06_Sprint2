package com.example.job_search_system_api.service;

import com.example.job_search_system_api.dto.IRoleDto;

import java.util.Set;

public interface IRoleService {
    Set<IRoleDto> getRoles(String username);
}
