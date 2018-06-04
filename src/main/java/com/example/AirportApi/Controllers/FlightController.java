package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Flight;
import com.example.AirportApi.Jpa.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @Autowired
    private FlightsRepository repository;

}
