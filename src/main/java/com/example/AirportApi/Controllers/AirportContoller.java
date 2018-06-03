package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Airport;
import com.example.AirportApi.Jpa.AirportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AirportContoller {
    @Autowired
    private AirportsRepository repository;


}
