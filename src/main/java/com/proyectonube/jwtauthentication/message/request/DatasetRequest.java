package com.proyectonube.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;

public class DatasetRequest{

    @NotBlank
    private Integer project;

    @NotBlank
    private String name;


    public DatasetRequest() {
    }

    public DatasetRequest(Integer project) {
        this.project = project;
    }

    public Integer getProject() {
        return this.project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public DatasetRequest project(Integer project) {
        this.project = project;
        return this;
    }
}