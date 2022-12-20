package com.example.job_search_system_api.service;

import com.example.job_search_system_api.dto.IUserDto;

public interface IUserService {
    IUserDto getUser(String username);
}
