package com.proyectonube.jwtauthentication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dataset")
public class Dataset{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "dataset", cascade = CascadeType.ALL)
    private List<Data> data;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_project")
    private Project project;

    public Dataset() {
    }

    public Dataset(Integer id, List<Data> data, Project project) {
        this.id = id;
        this.data = data;
        this.project = project;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Dataset data(List<Data> data) {
        this.data = data;
        return this;
    }

    public Dataset project(Project project) {
        this.project = project;
        return this;
    }
}