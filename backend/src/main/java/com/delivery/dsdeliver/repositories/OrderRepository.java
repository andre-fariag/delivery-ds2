package com.delivery.dsdeliver.repositories;

import com.delivery.dsdeliver.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
    
}
