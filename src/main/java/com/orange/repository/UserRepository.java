package com.orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
