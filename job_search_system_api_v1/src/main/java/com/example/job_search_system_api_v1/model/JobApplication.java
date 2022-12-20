package com.example.job_search_system_api_v1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class JobApplication {

    @Id
    private int id;
    private String timeCreate;

    private String title;
    private String academicLevel;
    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;
    private int currentRankId;
    private int levelDesiredId;
    private double desireMinimumWage;
    private String careerGoals;
    private String workplaceDesired;

    public Experience getExperience() {
        return experience;
    }
}
