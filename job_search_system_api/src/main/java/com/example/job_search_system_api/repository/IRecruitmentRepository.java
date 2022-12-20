package com.example.job_search_system_api.repository;

import com.example.job_search_system_api.dto.IRecruitmentDto;
import com.example.job_search_system_api.dto.IRecruitmentPageDto;
import com.example.job_search_system_api.model.Recruitment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IRecruitmentRepository extends JpaRepository<Recruitment, Integer> {
    @Query(value = "select r.title as title,e.name_company as nameCompany, r.id as id,  r.wage as wage, r.deadline as deadline ," +
            "e.img as img " +
            " from recruitment as r " +
            " join employer as e on employer_id=e.id " +
            "where r.is_delete = 0 and deadline > curdate() ",
            countQuery = "select count(*) ", nativeQuery = true)
    Page<IRecruitmentPageDto> searchRecruitment(Pageable pageable);

    @Query(value = "select r.title as title,e.name_company as nameCompany, r.id as id,  r.wage as wage, r.deadline as deadline ," +
            "e.img as img " +
            " from recruitment as r " +
            " join employer as e on employer_id=e.id " +
            "where r.is_delete = 0 and deadline > curdate() and time_create>DATE_SUB(curdate(),INTERVAL 3 day) ",
            countQuery = "select count(*) ", nativeQuery = true)
    Page<IRecruitmentPageDto> searchRecruitmentNew(Pageable pageable);

    @Query(value = "select r.title, r.id as id, r.wage as wage, r.level as level, r.conscious as consious, r.career as career, " +
            "r.nature_of_work as natureOfWork, r.working_form as workingForm, r.probationary_period as probationaryPeriod, " +
            "r.gender_request as genderRequest, r.number_of_vacancies as numberOfVacancies, r.description as description, " +
            "r.interest as interest, e.content as experience, r.deadline as deadline, r.request as request, " +
            "em.img as img,em.name_company as nameCompany " +
            " from recruitment as r " +
            " join experience as e on r.experience_id = e.id " +
            " join employer as em on r.employer_id=em.id " +
            "where r.is_delete = 0 and deadline > curdate() and r.id = :id ", nativeQuery = true)
    Optional<IRecruitmentDto> searchRecruitmentById(@Param("id") int id);
    @Query(value = "select r.title as title,e.name_company as nameCompany, r.id as id,  r.wage as wage, r.deadline as deadline ," +
            "e.img as img " +
            " from recruitment as r " +
            " join employer as e on employer_id=e.id " +
            "where r.is_delete = 0 and deadline > curdate() and r.title like %:titleSearch% and e.name_company like %:nameCompany%  ",
            countQuery = "select count(*) ", nativeQuery = true)
    Page<IRecruitmentPageDto> searchRecruitment(Pageable pageable, String titleSearch, String nameCompany);
}
