package com.ironhack.Airlines.repository;

import com.ironhack.Airlines.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {


}
