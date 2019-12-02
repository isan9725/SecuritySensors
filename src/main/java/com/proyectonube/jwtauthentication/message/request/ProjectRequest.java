package com.proyectonube.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;

public class ProjectRequest{

    @NotBlank
    private String description;

    @NotBlank
    private String projectName;


    public ProjectRequest() {
    }

    public ProjectRequest(String description, String projectName) {
        this.description = description;
        this.projectName = projectName;
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

    public ProjectRequest description(String description) {
        this.description = description;
        return this;
    }

    public ProjectRequest projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }    
}