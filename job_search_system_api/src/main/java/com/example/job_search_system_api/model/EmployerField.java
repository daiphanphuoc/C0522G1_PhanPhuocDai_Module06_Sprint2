package com.example.job_search_system_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployerField {
    @Id
    private int id;
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    public EmployerField() {
    }

    public EmployerField(int id, boolean isDelete, Field field, Employer employer) {
        this.id = id;
        this.isDelete = isDelete;
        this.field = field;
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Field getField() {
        return field;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
