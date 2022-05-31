package com.ironhack.Airlines.services;

import com.ironhack.Airlines.model.Customer;
import com.ironhack.Airlines.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public  List<Customer> getAllCustomerNames(){
        ArrayList names = new ArrayList<>();
        for (Customer c : customerRepository.findAll()){
            names.add(c.getNombre());
        }
        return names;
    }


}
