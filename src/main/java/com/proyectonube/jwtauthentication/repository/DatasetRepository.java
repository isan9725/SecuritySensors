package com.proyectonube.jwtauthentication.repository;

import com.proyectonube.jwtauthentication.model.Dataset;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatasetRepository extends JpaRepository< Dataset, Integer >{

}