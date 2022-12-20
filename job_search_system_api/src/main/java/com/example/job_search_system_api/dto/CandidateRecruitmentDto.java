package com.example.job_search_system_api.dto;

public class CandidateRecruitmentDto {
    private int id;
    private int candidateId;
    private int recruitmentId;

    public CandidateRecruitmentDto() {
    }

    public CandidateRecruitmentDto(int id, int candidateId, int recruitmentId) {
        this.id = id;
        this.candidateId = candidateId;
        this.recruitmentId = recruitmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(int recruitmentId) {
        this.recruitmentId = recruitmentId;
    }
}
