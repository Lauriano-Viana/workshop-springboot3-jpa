package com.lauriscode.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauriscode.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
