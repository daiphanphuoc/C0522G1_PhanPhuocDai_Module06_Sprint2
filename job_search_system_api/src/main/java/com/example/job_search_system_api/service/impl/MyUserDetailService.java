package com.example.job_search_system_api.service.impl;

import com.example.job_search_system_api.dto.IRoleDto;
import com.example.job_search_system_api.dto.IUserDto;
import com.example.job_search_system_api.dto.MyUserDetail;
import com.example.job_search_system_api.dto.UserDto;
import com.example.job_search_system_api.repository.IRoleRepository;
import com.example.job_search_system_api.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        IUserDto userDto = userRepository.searchUsername(username);

        if (userDto == null) {
            throw new UsernameNotFoundException("User Name: " + username + "Not Found");
        }
        Set<IRoleDto> roleDtos = roleRepository.findRole(username);
        UserDto user = new UserDto(userDto);
        user.setRoleDtos(roleDtos);

//        UserDto user = null;
        return new MyUserDetail(user);
    }
}
