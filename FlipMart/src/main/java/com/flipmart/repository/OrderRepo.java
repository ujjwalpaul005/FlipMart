package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
