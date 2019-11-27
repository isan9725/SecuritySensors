package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Data;
import com.proyectonube.jwtauthentication.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService{

    @Autowired
    private DataRepository dataRepository;

    public List< Data > getData(){
        return dataRepository.findAll();
    }
}