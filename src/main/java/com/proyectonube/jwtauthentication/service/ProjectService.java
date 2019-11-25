package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    public List< Project > getProject(){
        return projectRepository.findAll();
    }

}