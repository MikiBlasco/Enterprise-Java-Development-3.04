package com.ironhack.Airlines.services;


import com.ironhack.Airlines.model.Vuelos;
import com.ironhack.Airlines.repository.VuelosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VuelosService {

    @Autowired
    VuelosRepository vuelosRepository;

    public List<Vuelos> getAllVuelos(){
        return vuelosRepository.findAll();
    }

}
