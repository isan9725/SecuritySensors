package com.proyectonube.jwtauthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data{

    @Id
    private Integer id;

    @Column (name = "value")
    private String value;

    @Column
    private Integer deviceId;

    public Data(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Data(String value, Integer deviceId) {
        this.value = value;
        this.deviceId = deviceId;
    }
}