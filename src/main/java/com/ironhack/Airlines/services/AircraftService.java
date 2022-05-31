package com.ironhack.Airlines.services;


import com.ironhack.Airlines.model.Aircraft;
import com.ironhack.Airlines.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {

    @Autowired
    AircraftRepository aircraftRepository;

    public List<Aircraft> getAllAircrafts(){
        return aircraftRepository.findAll();
    }

    public List<Aircraft> getAircraftsWithMoreThan300Seats() {
        List<Aircraft> aviones = new ArrayList<>();
        for (Aircraft a : aircraftRepository.findAll()) {
            if(a.getSeats() > 300) {
                aviones.add(a);
            }
        }
        return aviones;
    }


}
