package com.example.job_search_system_api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class UserRole implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
    private boolean isDelete;

    public UserRole() {
    }

    public UserRole(User user, Role role, boolean isDelete) {
        this.user = user;
        this.role = role;
        this.isDelete = isDelete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
