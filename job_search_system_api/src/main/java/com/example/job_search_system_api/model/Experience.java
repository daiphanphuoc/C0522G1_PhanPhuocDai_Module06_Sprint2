package com.example.job_search_system_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Experience {
    @Id
    private int id;
    private String content;
    private boolean isDelete;

    public Experience() {
    }

    public Experience(int id, String content, boolean isDelete) {
        this.id = id;
        this.content = content;
        this.isDelete = isDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
