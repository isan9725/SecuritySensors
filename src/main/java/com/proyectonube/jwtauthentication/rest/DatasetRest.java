package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.DatasetRequest;
import com.proyectonube.jwtauthentication.model.Dataset;
import com.proyectonube.jwtauthentication.service.DatasetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatasetRest{

    @Autowired
    private DatasetService datasetService;

    @GetMapping("/dataset")
    public ResponseEntity< List< Dataset > > listdataset(){
        List <Dataset> listDataset = datasetService.getDataset();
        return ResponseEntity.ok(listDataset);
    }

    @PostMapping("/project/dataset")
    public ResponseEntity<Dataset> createDataset(@RequestBody DatasetRequest dataset){
        Dataset ds = datasetService.create(dataset);
        return ResponseEntity.status(HttpStatus.CREATED).body(ds);
    }
}