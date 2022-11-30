package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
