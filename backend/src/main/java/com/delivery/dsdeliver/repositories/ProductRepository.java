package com.delivery.dsdeliver.repositories;

import java.util.List;

import com.delivery.dsdeliver.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> { //entity type and primary key type
    
    List<Product> findAllByOrderByNameAsc(); //gets data from database and puts in order
}
