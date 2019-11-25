package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRest{

    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    public ResponseEntity< List< Project > > listProject(){
        List<Project> project = projectService.getProject();
        return ResponseEntity.ok(project);
    }
}