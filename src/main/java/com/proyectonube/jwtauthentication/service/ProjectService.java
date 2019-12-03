package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.ProjectRequest;
import com.proyectonube.jwtauthentication.model.Message;
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

    public Project create(ProjectRequest projectR){
        Project createProject = new Project();

        createProject.setProjectName(projectR.getProjectName());
        createProject.setDescription(projectR.getDescription());

        return projectRepository.save(createProject);
    }

    public Project findProject(Integer id_project){
        Project prt = projectRepository.getOne(id_project);
        return prt;
    }

    public Message update(ProjectRequest projectR){

        Message m = new Message();

        return m;
    }

}