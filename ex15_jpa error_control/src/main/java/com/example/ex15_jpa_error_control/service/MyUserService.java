package com.example.ex15_jpa_error_control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex15_jpa_error_control.entity.MyUser;
import com.example.ex15_jpa_error_control.repository.MyUserRepository;

@Service
public class MyUserService {

    @Autowired
    private MyUserRepository myUserRepository;

    public List<MyUser> list() {
        return myUserRepository.findAll();
    }
}
