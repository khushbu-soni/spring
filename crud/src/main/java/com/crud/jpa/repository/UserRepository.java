package com.crud.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
}
