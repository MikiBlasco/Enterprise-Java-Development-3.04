package com.ironhack.Airlines.controller;

import com.ironhack.Airlines.model.Customer;
import com.ironhack.Airlines.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping ("/customers")

    public List <Customer> showAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping ("/customer-names")
    public List<Customer> showAllCustomerNames(){
        return customerService.getAllCustomerNames();
    }

}
