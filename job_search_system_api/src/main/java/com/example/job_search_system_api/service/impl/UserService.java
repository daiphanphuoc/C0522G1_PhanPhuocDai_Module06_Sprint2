package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.dto.IUserDto;
import com.example.job_search_system_api.repository.IUserRepository;
import com.example.job_search_system_api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public IUserDto getUser(String username) {
        return userRepository.searchUsername(username);
    }
}
