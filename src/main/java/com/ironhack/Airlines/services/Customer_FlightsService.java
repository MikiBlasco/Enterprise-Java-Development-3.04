package com.ironhack.Airlines.services;


import com.ironhack.Airlines.model.Customer_Flights;
import com.ironhack.Airlines.repository.Customer_FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_FlightsService {

    @Autowired
    Customer_FlightsRepository customer_flightsRepository;

    public List<Customer_Flights> getAllCustomerFlights(){
        return customer_flightsRepository.findAll();
    }


}
