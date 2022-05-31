package com.ironhack.Airlines.repository;

import com.ironhack.Airlines.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Especifícamos <Aircraft, Integer>  1: El modelo al que hace referencia y el tipo de dato que es el primary key del modelo.
public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {




}
