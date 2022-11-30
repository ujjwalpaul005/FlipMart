package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}
