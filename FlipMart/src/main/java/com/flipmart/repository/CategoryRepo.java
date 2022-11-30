package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
