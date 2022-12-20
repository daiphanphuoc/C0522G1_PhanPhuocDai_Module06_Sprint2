package com.example.job_search_system_api_v1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RankLevel {

    @Id
    private int id;
    private String level;
    private boolean isDelete;

    public RankLevel() {
    }

    public RankLevel(int id, String level, boolean isDelete) {
        this.id = id;
        this.level = level;
        this.isDelete = isDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
