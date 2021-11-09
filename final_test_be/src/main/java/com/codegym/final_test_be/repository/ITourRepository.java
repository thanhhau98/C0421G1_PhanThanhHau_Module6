package com.codegym.final_test_be.repository;

import com.codegym.final_test_be.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITourRepository extends JpaRepository<Tour, Integer> {
}
