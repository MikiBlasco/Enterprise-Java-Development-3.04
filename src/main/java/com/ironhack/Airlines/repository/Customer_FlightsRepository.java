package com.ironhack.Airlines.repository;

import com.ironhack.Airlines.model.Customer_Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_FlightsRepository extends JpaRepository<Customer_Flights, Integer> {



}
