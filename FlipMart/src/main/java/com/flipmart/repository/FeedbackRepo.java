package com.flipmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipmart.module.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
