package com.ironhack.Airlines.repository;

import com.ironhack.Airlines.model.Vuelos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VuelosRepository extends JpaRepository<Vuelos, String> {

  // public List<Vuelos> findAllFlightsNumberContains(String str);

  //primero se crea la llamada aquí. Luego servicio y luego se utuliza en el controller.




}
