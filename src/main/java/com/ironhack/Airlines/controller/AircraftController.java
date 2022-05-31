package com.ironhack.Airlines.controller;

import com.ironhack.Airlines.model.Aircraft;
import com.ironhack.Airlines.services.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AircraftController {

    @Autowired
    AircraftService aircraftService;

    @GetMapping("/aircrafts")

    public List<Aircraft> getAllAircrafts(){

        return aircraftService.getAllAircrafts();
    }

    @GetMapping("/aircrafts-more-than-300-seats")
    public List<Aircraft> getAircraftsWithMoreThan200Seats(){
        return aircraftService.getAircraftsWithMoreThan300Seats();
    }




}
