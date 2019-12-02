package com.proyectonube.jwtauthentication.repository;

import com.proyectonube.jwtauthentication.model.Datatype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatatypeRepository extends JpaRepository<Datatype, Integer>{

}