package com.example.job_search_system_api_v1.repository;

import com.example.job_search_system_api_v1.dto.IJobApplicationDto;
import com.example.job_search_system_api_v1.model.JobApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Transactional
public interface IJobApplicationRepository extends JpaRepository<JobApplication,Integer> {

    Optional<JobApplication> findById(int id);
    @Query(value = "select title, academicLevel from job_application ",
            countQuery = "select count(*) from job_application ",nativeQuery = true)
    Page<IJobApplicationDto> searchAll(Pageable pageable);

}
