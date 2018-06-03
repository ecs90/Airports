package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Cabine;
import com.example.AirportApi.Jpa.CabinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabineController {
    @Autowired
    private CabinesRepository repository;

}
