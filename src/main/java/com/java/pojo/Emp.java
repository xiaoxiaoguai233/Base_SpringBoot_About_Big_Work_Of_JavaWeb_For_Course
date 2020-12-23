package com.java.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
public class Emp {
    private Integer id;
    private String listName;
    private String email;
    private Integer gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private Integer typeId;

    private String empName;
    public Emp(Integer id, String listName, String email, Integer gender, Date birth, Integer typeId, String empName) {
        this.id = id;
        this.listName = listName;
        this.email = email;
        this.gender = gender;
        this.birth = birth;

        this.typeId = typeId;

        this.empName = empName;
    }

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Emp(String listName, String email, Integer gender, Date birth, Integer typeId, String empName) {
        this.listName = listName;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.typeId = typeId;
        this.empName = empName;
    }
}
