package com.example.job_search_system_api.dto;

import java.util.Set;

public class UserDto {
    String username;
    String password;
    Set<IRoleDto> roleDtos;

    public UserDto() {
    }

    public UserDto(String username, String password, Set<IRoleDto> roleDtos) {
        this.username = username;
        this.password = password;
        this.roleDtos = roleDtos;
    }

    public UserDto(IUserDto iUserDto) {
        this.username = iUserDto.getUsername();
        this.password = iUserDto.getPassword();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<IRoleDto> getRoleDtos() {
        return roleDtos;
    }

    public void setRoleDtos(Set<IRoleDto> roleDtos) {
        this.roleDtos = roleDtos;
    }
}
