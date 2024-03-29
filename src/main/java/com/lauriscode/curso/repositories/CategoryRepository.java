package com.lauriscode.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauriscode.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
