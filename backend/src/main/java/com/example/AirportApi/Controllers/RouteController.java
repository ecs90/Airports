package com.example.AirportApi.Controllers;

import com.example.AirportApi.Jpa.RoutesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    @Autowired
    private RoutesRepository repository;

}
