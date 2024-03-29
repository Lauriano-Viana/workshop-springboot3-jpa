package com.lauriscode.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauriscode.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
