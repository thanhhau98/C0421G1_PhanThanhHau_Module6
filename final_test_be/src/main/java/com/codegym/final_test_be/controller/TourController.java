package com.codegym.final_test_be.controller;

import com.codegym.final_test_be.dto.TourDto;
import com.codegym.final_test_be.entity.Tour;
import com.codegym.final_test_be.service.ITourService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/tour")
public class TourController {

    @Autowired
    ITourService tourService;

    @GetMapping("/list")
    public ResponseEntity<List<Tour>>findAll(){
        List<Tour> tours = tourService.findAll();
        return (tours.size() == 0) ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(tours, HttpStatus.OK);
    }

    @PostMapping(value = "/create" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer>createTour(@RequestBody TourDto tourDto ,
                                             BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Tour tour = new Tour();
        BeanUtils.copyProperties(tourDto,tour);
        tourService.addTour(tour);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
