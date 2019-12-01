package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.message.request.DataRequest;
import com.proyectonube.jwtauthentication.model.Data;
import com.proyectonube.jwtauthentication.service.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRest{

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public ResponseEntity< List< Data > > listOfData(){
        List<Data> data = dataService.getData();
        return ResponseEntity.ok(data);
    }

    @PostMapping("/data")
    public ResponseEntity<Data> createData(@RequestBody DataRequest data){
        Data d = dataService.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(d);
    }
}