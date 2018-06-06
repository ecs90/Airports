package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.City;
import com.example.AirportApi.Jpa.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CitiesRepository repository;

}
