package com.lauriscode.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauriscode.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
