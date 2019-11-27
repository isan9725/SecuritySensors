package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Dataset;
import com.proyectonube.jwtauthentication.service.DatasetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}