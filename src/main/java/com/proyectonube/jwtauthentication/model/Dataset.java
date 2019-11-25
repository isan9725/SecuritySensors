package com.proyectonube.jwtauthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dataset")
public class Dataset{

    @Id
    private Integer id;

    @Column
    private String dataType;


    public Dataset() {
    }

    public Dataset(Integer id, String dataType) {
        this.id = id;
        this.dataType = dataType;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Dataset id(Integer id) {
        this.id = id;
        return this;
    }

    public Dataset dataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
}