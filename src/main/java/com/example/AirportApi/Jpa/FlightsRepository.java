package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface FlightsRepository extends JpaRepository<Flight, Long> {

}
