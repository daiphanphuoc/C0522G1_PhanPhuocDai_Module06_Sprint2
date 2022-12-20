package com.example.job_search_system_api_v1.repository;

import com.example.job_search_system_api_v1.dto.IEmployerDto;
import com.example.job_search_system_api_v1.model.Employer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface IEmployerRepository extends JpaRepository<Employer, Integer> {


    @Query(value = "select employer.name as name " +
            "from employer ",
            countQuery = "select count(*) from employer ", nativeQuery = true)
    Page<IEmployerDto> searchAll(Pageable pageable);
}
