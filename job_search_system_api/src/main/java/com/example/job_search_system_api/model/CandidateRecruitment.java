package com.example.job_search_system_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CandidateRecruitment {
    @Id
    int id;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    Candidate candidate;
    @ManyToOne
    @JoinColumn(name = "recruitment_id")
    Recruitment recruitment;

    String timeRecruitment;

    boolean isDelete;
    boolean status;

    public CandidateRecruitment() {
    }

    public CandidateRecruitment(int id, Candidate candidate, Recruitment recruitment, String timeRecruitment,
                                boolean isDelete, boolean status) {
        this.id = id;
        this.candidate = candidate;
        this.recruitment = recruitment;
        this.timeRecruitment = timeRecruitment;
        this.isDelete = isDelete;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeRecruitment() {
        return timeRecruitment;
    }

    public void setTimeRecruitment(String timeRecruitment) {
        this.timeRecruitment = timeRecruitment;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}
