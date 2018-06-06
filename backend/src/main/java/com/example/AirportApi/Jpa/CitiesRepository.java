package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface CitiesRepository extends JpaRepository<City, Long> {

}
