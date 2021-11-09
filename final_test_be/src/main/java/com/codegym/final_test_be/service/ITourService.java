package com.codegym.final_test_be.service;

import com.codegym.final_test_be.entity.Tour;

import java.util.List;

public interface ITourService {
    void addTour(Tour tour);
    List<Tour> findAll();
}
