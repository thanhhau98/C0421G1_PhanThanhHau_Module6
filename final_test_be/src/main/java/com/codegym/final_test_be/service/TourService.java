package com.codegym.final_test_be.service;

import com.codegym.final_test_be.entity.Tour;
import com.codegym.final_test_be.repository.ITourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService implements ITourService {

    @Autowired
    ITourRepository tourRepository;

    @Override
    public void addTour(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public List<Tour> findAll() {
        return tourRepository.findAll();
    }
}
