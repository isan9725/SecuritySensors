package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.ProjectRequest;
import com.proyectonube.jwtauthentication.model.Message;
import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<Project> project = projectService.getListProject();
        return ResponseEntity.ok(project);
    }

    @GetMapping("/project/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Integer id){
        Project pt = projectService.getProject(id);
        return ResponseEntity.ok(pt);
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

    @DeleteMapping("/project/{id}")
    public ResponseEntity<Message> deleteProject(@PathVariable Integer id){
        Message m = projectService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(m);
    }
}