package com.proyectonube.jwtauthentication.service;

import java.util.Optional;

import com.proyectonube.jwtauthentication.model.User;
import com.proyectonube.jwtauthentication.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public User getUser(String username){
        if(userRepository.existsByUsername(username)){
            Optional<User> us = userRepository.findByUsername(username);
            return us.get();
        }else{
            throw new RuntimeException("No existe un usuario con ese  username");
        }
        
    }
}