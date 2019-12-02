package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.DatasetRequest;
import com.proyectonube.jwtauthentication.model.Dataset;
import com.proyectonube.jwtauthentication.model.Project;
import com.proyectonube.jwtauthentication.repository.DatasetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasetService{

    @Autowired
    private DatasetRepository datasetRepository;

    @Autowired
    private ProjectService projectService;

    public List < Dataset > getDataset(){
        return datasetRepository.findAll();
    }

    public Dataset findDataset(Integer id_dataset){
        Dataset ds = datasetRepository.getOne(id_dataset);
        return ds;
    }

    public Dataset create(DatasetRequest datasetR){
        Dataset createDataset = new Dataset();

        Project prt = projectService.findProject(datasetR.getProject());
        createDataset.setProject(prt);

        return datasetRepository.save(createDataset);

    }
}