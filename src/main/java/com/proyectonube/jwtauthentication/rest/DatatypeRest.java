package com.proyectonube.jwtauthentication.rest;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Datatype;
import com.proyectonube.jwtauthentication.service.DatatypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatatypeRest{

    @Autowired
    private DatatypeService datatypeservice;

    @GetMapping("/datatype")
    public ResponseEntity < List <Datatype> > listDatatypes(){
        List < Datatype > datatype = datatypeservice.listDatatypes();
        return ResponseEntity.ok(datatype);
    }

    @PostMapping("/datatype")
    public ResponseEntity<Datatype> crearteDatatype(@RequestBody Datatype datatype){
        Datatype dt = datatypeservice.create(datatype);
        return ResponseEntity.status(HttpStatus.CREATED).body(dt);
    }
}