package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.DataRequest;
import com.proyectonube.jwtauthentication.model.Data;
import com.proyectonube.jwtauthentication.model.Dataset;
import com.proyectonube.jwtauthentication.model.Datatype;
import com.proyectonube.jwtauthentication.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService{

    @Autowired
    private DataRepository dataRepository;

    @Autowired
    private DatatypeService datatypeService;

    @Autowired
    private DatasetService datasetService;

    public List< Data > getData(){
        return dataRepository.findAll();
    }

    public Data create(DataRequest dataR){
        Data createData = new Data();
        createData.setValue(dataR.getValue());
        createData.setDevice_id(dataR.getDevice_id());
        createData.setDate(dataR.getDate());

        Datatype dt = datatypeService.findDatatype(dataR.getDatatype());
        createData.setDatatype(dt);

        Dataset ds = datasetService.findDataset(dataR.getDataset());
        createData.setDataset(ds);

        return dataRepository.save(createData);
    }
}