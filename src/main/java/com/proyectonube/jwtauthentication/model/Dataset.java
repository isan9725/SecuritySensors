package com.proyectonube.jwtauthentication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "dataset")
public class Dataset{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "dataset", cascade = CascadeType.ALL)
    private List<Data> data;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_project")
    private Project project;


    public Dataset() {
    }

    public Dataset(Integer id, String name, List<Data> data, Project project) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.project = project;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Data> getData() {
        return this.data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Dataset id(Integer id) {
        this.id = id;
        return this;
    }

    public Dataset name(String name) {
        this.name = name;
        return this;
    }

    public Dataset data(List<Data> data) {
        this.data = data;
        return this;
    }

    public Dataset project(Project project) {
        this.project = project;
        return this;
    }   
}