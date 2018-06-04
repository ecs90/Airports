package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Rout;
import com.example.AirportApi.Jpa.RoutesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutController {
    @Autowired
    private RoutesRepository repository;

}
