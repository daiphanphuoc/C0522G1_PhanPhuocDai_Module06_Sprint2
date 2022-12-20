package com.example.job_search_system_api_v1.model;

import javax.persistence.*;

@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String phone;
    String email;
    String address;
    String nameCompany;
    String taxCode;
    String addressCompany;
    String personnelSize;
    boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    public Employer() {
    }

    public Employer(int id, String name, String phone, String email, String address, String nameCompany, String taxCode,
                    String addressCompany, String personnelSize, boolean isDelete, User user) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.nameCompany = nameCompany;
        this.taxCode = taxCode;
        this.addressCompany = addressCompany;
        this.personnelSize = personnelSize;
        this.isDelete = isDelete;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getPersonnelSize() {
        return personnelSize;
    }

    public void setPersonnelSize(String personnelSize) {
        this.personnelSize = personnelSize;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
