package com.proyectonube.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;

public class ProjectRequest{

    private Integer id;

    @NotBlank
    private String description;

    @NotBlank
    private String projectName;

    private String username;

    public ProjectRequest() {
    }

    public ProjectRequest(String description, String projectName) {
        this.description = description;
        this.projectName = projectName;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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