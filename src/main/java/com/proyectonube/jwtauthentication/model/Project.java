package com.proyectonube.jwtauthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project{
    
    @Id
    private Integer id;

    @Column
    private String description;

    @Column
    private String projectName;


    public Project() {
    }

    public Project(Integer id, String description, String projectName) {
        this.id = id;
        this.description = description;
        this.projectName = projectName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Project id(Integer id) {
        this.id = id;
        return this;
    }

    public Project description(String description) {
        this.description = description;
        return this;
    }

    public Project projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
}