package com.proyectonube.jwtauthentication.service;

import java.util.List;

import com.proyectonube.jwtauthentication.model.Datatype;
import com.proyectonube.jwtauthentication.model.Message;
import com.proyectonube.jwtauthentication.repository.DatatypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatatypeService{

    @Autowired
    private DatatypeRepository datatypeRepository;

    public List<Datatype> listDatatypes(){
        return datatypeRepository.findAll();
    }

    public Datatype create(Datatype datatype){
        Datatype createDatatype = new Datatype();
        createDatatype.setName(datatype.getName());

        return datatypeRepository.save(createDatatype);
    }

    public Datatype findDatatype(Integer id_datatype){
        Datatype dt = datatypeRepository.getOne(id_datatype);
        return dt;
    }

    public Message update(Datatype datatype){

        Message m = new Message();

        if(datatypeRepository.existsById(datatype.getId())){
            datatypeRepository.save(datatype);
            m.setText("Actualizado con Éxito");
            m.setIcon("icon");
        }else{
            m.setText("No se pudo Actualizar");
            m.setIcon("icon");
        }
        return m;
    }
}