package com.example.job_search_system_api.repository;

import com.example.job_search_system_api.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ICandidateRepository extends JpaRepository<Candidate,Integer> {

    @Query(value = "select id from candidate where is_delete = 0 and username =:username limit 1",nativeQuery = true)
    public Optional<Integer> getIdCandidate(@Param("username") String username);
}
