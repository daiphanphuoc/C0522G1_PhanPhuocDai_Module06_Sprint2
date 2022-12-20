package com.example.job_search_system_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recruitment {
    @Id
   private int id;
    private  String wage;
    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;
    private String level;
    private String title;
    private String conscious;
    private String career ;
    private String natureOfWork;
    private String workingForm ;
    private String probationaryPeriod ;
    private String genderRequest;
    private int numberOfVacancies;
    private boolean isDelete ;
    private String description ;
    private String request;
    private String interest ;
    private String deadline ;

    public Experience getExperience() {
        return experience;
    }

   @ManyToOne
   @JoinColumn(name = "employer_id")
   private Employer employer;

    public Employer getEmployer() {
        return employer;
    }

    public Recruitment() {
    }

    public Recruitment(int id, String wage, Experience experience, String level, String conscious, String career,
                       String natureOfWork, String workingForm, String probationaryPeriod, String genderRequest,
                       int numberOfVacancies, boolean isDelete, String description, String request, String interest,
                       String deadline, Employer employer) {
        this.id = id;
        this.wage = wage;
        this.experience = experience;
        this.level = level;
        this.conscious = conscious;
        this.career = career;
        this.natureOfWork = natureOfWork;
        this.workingForm = workingForm;
        this.probationaryPeriod = probationaryPeriod;
        this.genderRequest = genderRequest;
        this.numberOfVacancies = numberOfVacancies;
        this.isDelete = isDelete;
        this.description = description;
        this.request = request;
        this.interest = interest;
        this.deadline = deadline;
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getConscious() {
        return conscious;
    }

    public void setConscious(String conscious) {
        this.conscious = conscious;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getNatureOfWork() {
        return natureOfWork;
    }

    public void setNatureOfWork(String natureOfWork) {
        this.natureOfWork = natureOfWork;
    }

    public String getWorkingForm() {
        return workingForm;
    }

    public void setWorkingForm(String workingForm) {
        this.workingForm = workingForm;
    }

    public String getProbationaryPeriod() {
        return probationaryPeriod;
    }

    public void setProbationaryPeriod(String probationaryPeriod) {
        this.probationaryPeriod = probationaryPeriod;
    }

    public String getGenderRequest() {
        return genderRequest;
    }

    public void setGenderRequest(String genderRequest) {
        this.genderRequest = genderRequest;
    }

    public int getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
