package com.proyectonube.jwtauthentication.repository;

import com.proyectonube.jwtauthentication.model.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository< Data, Integer >{

}