package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface AirportsRepository extends JpaRepository<Airport, Long> {

}
