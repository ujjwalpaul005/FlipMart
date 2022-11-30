package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

}
