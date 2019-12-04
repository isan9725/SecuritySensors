package com.proyectonube.jwtauthentication.service;

import java.util.List;
import java.util.Optional;

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
        Optional<Dataset> optds = datasetRepository.findById(id_dataset);
        Dataset ds = optds.get();
        return ds;
    }

    public Dataset create(DatasetRequest datasetR){
        Dataset createDataset = new Dataset();

        createDataset.setName(datasetR.getName());

        Project prt = projectService.findProject(datasetR.getProject());
        createDataset.setProject(prt);

        return datasetRepository.save(createDataset);
    }
}