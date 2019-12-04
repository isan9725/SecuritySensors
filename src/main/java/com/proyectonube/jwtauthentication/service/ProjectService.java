package com.proyectonube.jwtauthentication.service;

import java.util.List;
import java.util.Optional;

import com.proyectonube.jwtauthentication.message.request.ProjectRequest;
import com.proyectonube.jwtauthentication.model.Message;
import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.model.User;
import com.proyectonube.jwtauthentication.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserService userService;

    public List< Project > getListProject(){
        return projectRepository.findAll();
    }

    public Project getProject(Integer id){
        Optional<Project> opt = projectRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            throw new RuntimeException("No se encontro el proyecto con el id " + id);
        }
    }

    public Project create(ProjectRequest projectR){
        Project createProject = new Project();

        createProject.setProjectName(projectR.getProjectName());
        createProject.setDescription(projectR.getDescription());

        String username = projectR.getUsername();
        User user = userService.getUser(username);

        createProject.getUsers().add(user);

        return projectRepository.save(createProject);
    }

    public Project findProject(Integer id_project){
        Project prt = projectRepository.getOne(id_project);
        return prt;
    }

    public Message update(ProjectRequest projectR){

        Message m = new Message();

        if(projectRepository.existsById(projectR.getId())){
            Optional<Project> opt = projectRepository.findById(projectR.getId());
            Project project = opt.get();
            project.setProjectName(project.getProjectName());
            project.setDescription(project.getDescription());
            projectRepository.save(project);
            m.setText("Actualizado con éxito");
            m.setIcon("icon");
        }else{
            m.setText("No se pudo actualizar, no existe proyecto con el id" + projectR.getId());
            m.setIcon("icon");
        }

        return m;
    }

    public Message delete(Integer id){
        Message m = new Message();

        if(projectRepository.existsById(id)){
            Optional<Project> opt = projectRepository.findById(id);
            Project project = opt.get();
            projectRepository.delete(project);
            m.setText("Eliminado con éxito");
            m.setIcon("icon");
        }else{
            m.setText("No se pudo eliminar el proyecto con el id " + id);
            m.setIcon("icon");
        }

        return m;
    }

}