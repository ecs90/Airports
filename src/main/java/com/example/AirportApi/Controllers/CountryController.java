package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Country;
import com.example.AirportApi.Jpa.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    private CountriesRepository repository;

}
