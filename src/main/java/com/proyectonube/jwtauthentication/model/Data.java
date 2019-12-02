package com.proyectonube.jwtauthentication.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "data")
public class Data{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column (name = "value")
    private String value;

    @Column(name = "device_id")
    private Integer device_id;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_datatype")
    private Datatype datatype;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dataset")
    private Dataset dataset;


    public Data() {
    }

    public Data(Integer id, String value, Integer device_id, LocalDate date, Datatype datatype, Dataset dataset) {
        this.id = id;
        this.value = value;
        this.device_id = device_id;
        this.date = date;
        this.datatype = datatype;
        this.dataset = dataset;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Datatype getDatatype() {
        return this.datatype;
    }

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }

    public Dataset getDataset() {
        return this.dataset;
    }

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    public Data id(Integer id) {
        this.id = id;
        return this;
    }

    public Data value(String value) {
        this.value = value;
        return this;
    }

    public Data device_id(Integer device_id) {
        this.device_id = device_id;
        return this;
    }

    public Data date(LocalDate date) {
        this.date = date;
        return this;
    }

    public Data datatype(Datatype datatype) {
        this.datatype = datatype;
        return this;
    }

    public Data dataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
}