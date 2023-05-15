package com.phoenix.Springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.Springdemo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
