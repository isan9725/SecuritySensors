package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Dataset;
import com.proyectonube.jwtauthentication.repository.DatasetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasetService{

    @Autowired
    private DatasetRepository datasetRepository;

    public List < Dataset > getDataset(){
        return datasetRepository.findAll();
    }

    public Dataset findDataset(Integer id_dataset){
        Dataset ds = datasetRepository.getOne(id_dataset);
        return ds;
    }
}