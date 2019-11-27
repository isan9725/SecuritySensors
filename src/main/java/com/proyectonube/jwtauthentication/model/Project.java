package com.proyectonube.jwtauthentication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project{
    
    @Id
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "project_name")
    private String projectName;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "listen_types",
        joinColumns = @JoinColumn(name = "id_project"),
        inverseJoinColumns = @JoinColumn(name = "id_dataset"))
    private List < Dataset > dataset; 

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_project",
        joinColumns = @JoinColumn(name="id_project"),
        inverseJoinColumns = @JoinColumn(name="id_user"))
    private List < User > users;

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

    /**
     * @return the dataset
     */
    public List<Dataset> getDataset() {
        return dataset;
    }

    /**
     * @param dataset the dataset to set
     */
    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

    /**
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<User> users) {
        this.users = users;
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