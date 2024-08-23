package com.example.ex15_jpa_error_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex15_jpa_error_control.entity.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, String> {

}
