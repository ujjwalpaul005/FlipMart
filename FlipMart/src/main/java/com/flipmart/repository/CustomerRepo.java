package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
