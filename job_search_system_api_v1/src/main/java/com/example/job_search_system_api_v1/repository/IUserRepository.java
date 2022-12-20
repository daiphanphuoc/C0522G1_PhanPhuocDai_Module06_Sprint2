package com.example.job_search_system_api_v1.repository;

import com.example.job_search_system_api_v1.dto.IUserDto;
import com.example.job_search_system_api_v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface IUserRepository extends JpaRepository<User, String> {
//    Optional<User> findByUsername(String username);

    @Query(value = "select username, password from `user`  where username = :username and is_delete = 0 ", nativeQuery = true)
    IUserDto searchUsername(@Param("username") String username);
}
