package com.ironhack.Airlines.repository;

import com.ironhack.Airlines.model.Vuelos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelosRepository extends JpaRepository<Vuelos, String> {



}
