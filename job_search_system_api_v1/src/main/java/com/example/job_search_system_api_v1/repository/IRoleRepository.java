package com.example.job_search_system_api_v1.repository;

import com.example.job_search_system_api_v1.dto.IRoleDto;
import com.example.job_search_system_api_v1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface IRoleRepository extends JpaRepository<Role, Integer> {

    @Query(value = "select role.name as roleName " +
            "from role " +
            "join user_role on user_role.role_id = role.id " +
            "join user on user.username = user_role.username " +
            "where user.username = :username", nativeQuery = true)
    Set<IRoleDto> findRole(@Param("username") String username);
}
