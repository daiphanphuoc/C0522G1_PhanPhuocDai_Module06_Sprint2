package com.example.job_search_system_api.dto;

import com.example.job_search_system_api.model.Experience;

public interface IJobApplicationDto {
    int getId();

    String getTitle();

    public String getExperience();

    public String getTimeCreate();


    public String getAcademicLevel();

    public int getCurrentRankId();

    public int getLevelDesiredId();

    public double getDesireMinimumWage();

    public String getCareerGoals();

    public String getWorkplaceDesired();
}
