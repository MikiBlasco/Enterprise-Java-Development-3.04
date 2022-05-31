package com.ironhack.Airlines.controller;

import com.ironhack.Airlines.model.Customer_Flights;
import com.ironhack.Airlines.services.Customer_FlightsService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Customer_FlightsController {

    @Autowired
    Customer_FlightsService customer_flightsService;

    @GetMapping ("/bookings")
    public List<Customer_Flights> showAllBookings(){
        return customer_flightsService.getAllCustomerFlights();
    }

}
