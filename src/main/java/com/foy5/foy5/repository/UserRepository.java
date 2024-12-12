package com.foy5.foy5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foy5.foy5.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
