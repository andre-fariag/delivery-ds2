package com.delivery.dsdeliver.repositories;

import java.util.List;

import com.delivery.dsdeliver.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // returning only pending orders ordered by moment
    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
            + " WHERE obj.status = 0 ORDER BY obj.moment ASC")
    List<Order> findOrdersWithProducts();

}
