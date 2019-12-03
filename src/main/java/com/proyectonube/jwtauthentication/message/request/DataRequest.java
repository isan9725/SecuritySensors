package com.proyectonube.jwtauthentication.message.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

public class DataRequest {

    @NotBlank
    private String value;

    @NotBlank
    private Integer device_id;

    @NotBlank
    private LocalDateTime date;

    @NotBlank
    private Integer datatype;

    @NotBlank
    private Integer dataset;


    public DataRequest() {
    }

    public DataRequest(String value, Integer device_id, LocalDateTime date, Integer datatype, Integer dataset) {
        this.value = value;
        this.device_id = device_id;
        this.date = date;
        this.datatype = datatype;
        this.dataset = dataset;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDevice_id() {
        return this.device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getDatatype() {
        return this.datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    public Integer getDataset() {
        return this.dataset;
    }

    public void setDataset(Integer dataset) {
        this.dataset = dataset;
    }

    public DataRequest value(String value) {
        this.value = value;
        return this;
    }

    public DataRequest device_id(Integer device_id) {
        this.device_id = device_id;
        return this;
    }

    public DataRequest date(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public DataRequest datatype(Integer datatype) {
        this.datatype = datatype;
        return this;
    }

    public DataRequest dataset(Integer dataset) {
        this.dataset = dataset;
        return this;
    }
}