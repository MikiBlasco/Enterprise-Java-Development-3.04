package com.ironhack.Airlines.controller;


import com.ironhack.Airlines.model.Vuelos;
import com.ironhack.Airlines.repository.VuelosRepository;
import com.ironhack.Airlines.services.VuelosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VuelosController {

    @Autowired
    VuelosService vuelosService;

    @GetMapping ("/vuelos")
    public List<Vuelos> showAllVuelos(){
        return vuelosService.getAllVuelos();
    }

}
