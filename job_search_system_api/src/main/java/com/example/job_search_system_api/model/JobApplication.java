package com.example.job_search_system_api.model;

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

    public int getId() {
        return id;
    }

    public String getTimeCreate() {
        return timeCreate;
    }

    public String getTitle() {
        return title;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public int getCurrentRankId() {
        return currentRankId;
    }

    public int getLevelDesiredId() {
        return levelDesiredId;
    }

    public double getDesireMinimumWage() {
        return desireMinimumWage;
    }

    public String getCareerGoals() {
        return careerGoals;
    }

    public String getWorkplaceDesired() {
        return workplaceDesired;
    }
}
