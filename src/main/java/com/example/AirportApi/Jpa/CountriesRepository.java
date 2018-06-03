package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface CountriesRepository extends JpaRepository<Country, Long> {

}