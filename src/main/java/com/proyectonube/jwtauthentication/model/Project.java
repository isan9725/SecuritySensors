package com.proyectonube.jwtauthentication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "project_name")
    private String projectName;

    @OneToMany(mappedBy = "project")
    private List<Dataset> dataset;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "project_permission",
        joinColumns = @JoinColumn(name="project_id"),
        inverseJoinColumns = @JoinColumn(name="permission_id"))
    private List < User > users;


    public Project() {
    }

    public Project(Integer id, String description, String projectName, List<Dataset> dataset, List<User> users) {
        this.id = id;
        this.description = description;
        this.projectName = projectName;
        this.dataset = dataset;
        this.users = users;
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

    public List<Dataset> getDataset() {
        return this.dataset;
    }

    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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

    public Project dataset(List<Dataset> dataset) {
        this.dataset = dataset;
        return this;
    }

    public Project users(List<User> users) {
        this.users = users;
        return this;
    }
}