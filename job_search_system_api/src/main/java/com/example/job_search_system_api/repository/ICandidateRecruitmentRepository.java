package com.example.job_search_system_api.repository;

import com.example.job_search_system_api.dto.CandidateRecruitmentDto;
import com.example.job_search_system_api.model.CandidateRecruitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICandidateRecruitmentRepository extends JpaRepository<CandidateRecruitment,Integer> {

    @Modifying
    @Query(value = "insert into candidate_recruitment(candidate_id,recruitment_id) values (:candidate,:recruitment)",nativeQuery = true)
    public int addRecruitment(@Param("recruitment") int recruitmentId,
                              @Param("candidate")int candidateId);
}
