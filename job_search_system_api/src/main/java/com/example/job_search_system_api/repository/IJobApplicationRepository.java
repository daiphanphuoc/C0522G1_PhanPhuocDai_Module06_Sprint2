package com.example.job_search_system_api.repository;

import com.example.job_search_system_api.model.JobApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobApplicationRepository extends JpaRepository<JobApplication,Integer> {
}
