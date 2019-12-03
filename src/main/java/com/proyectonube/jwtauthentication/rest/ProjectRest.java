package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.ProjectRequest;
import com.proyectonube.jwtauthentication.model.Message;
import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/project")
    public ResponseEntity <Project> createProject(@RequestBody ProjectRequest project){
        Project p = projectService.create(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }

    @PutMapping("/project")
    public ResponseEntity<Message> updateProject(@RequestBody ProjectRequest project){
        Message m = projectService.update(project);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(m);
    }
}