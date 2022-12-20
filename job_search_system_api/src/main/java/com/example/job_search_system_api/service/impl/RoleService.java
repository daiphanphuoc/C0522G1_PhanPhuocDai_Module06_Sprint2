package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.dto.IRoleDto;
import com.example.job_search_system_api.repository.IRoleRepository;
import com.example.job_search_system_api.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.Set;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Set<IRoleDto> getRoles(String username) {
        return roleRepository.findRole(username);
    }
}
