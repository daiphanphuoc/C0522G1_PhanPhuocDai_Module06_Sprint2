package com.example.job_search_system_api.repository;

import com.example.job_search_system_api.dto.IEmployerDto;
import com.example.job_search_system_api.model.Employer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployerRepository extends JpaRepository<Employer, Integer> {

    @Query(value = "select employer.name as name " +
            "from employer ",
            countQuery = "select count(*) from employer ", nativeQuery = true)
    Page<IEmployerDto> searchAll(Pageable pageable);
}
