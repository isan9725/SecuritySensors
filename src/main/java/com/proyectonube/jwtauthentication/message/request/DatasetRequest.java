package com.proyectonube.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;

public class DatasetRequest{

    @NotBlank
    private Integer project;


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

    public DatasetRequest project(Integer project) {
        this.project = project;
        return this;
    }
}