package com.proyectonube.jwtauthentication.service;

import java.util.List;
import java.util.Optional;

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
        createDatatype.setMeasure(datatype.getMeasure());

        return datatypeRepository.save(createDatatype);
    }

    public Datatype findDatatype(Integer id_datatype){
        Optional<Datatype> optdt = datatypeRepository.findById(id_datatype);
        Datatype dt = optdt.get();
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

    public Message delete(Integer id){
        Message m = new Message();
        Optional<Datatype> datatype = datatypeRepository.findById(id);
        if(datatype.isPresent()){
            datatypeRepository.delete(datatype.get());
            
            m.setText("Datatype Eliminado con éxito");
            m.setIcon("icon");
        }else{
            m.setText("Datatyoe no encontrado");
            m.setIcon("icon");
            throw new RuntimeException("Datatype no encontrado con el id " + id);
        }
        return m;
    }
}