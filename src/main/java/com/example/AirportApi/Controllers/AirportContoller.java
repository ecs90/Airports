package com.example.AirportApi.Controllers;

import com.example.AirportApi.Entities.Airport;
import com.example.AirportApi.Jpa.AirportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class AirportContoller {
    @Autowired
    private AirportsRepository repository;

    //Agregar, modificar, eliminar, listar aeropuertos
    @GetMapping("/Airports")
    public List<Airport> retrieveAllAirports() {
        return repository.findAll();
    }

    @GetMapping("/Airport/{id}")
    public Airport retrieveAirport(@PathVariable long id) {
        Optional<Airport> airport = repository.findById(id);

        if (!airport.isPresent())
            throw new ResourceNotFoundException("id-" + id);

        return airport.get();
    }

    @DeleteMapping("/DeleteAirport/{id}")
    public void deleteAirport(@PathVariable long id) {
        repository.deleteById(id);
    }

    @PostMapping("/AddAirport") //post guarda sin id
    public Airport createAirport(@RequestBody Airport airport) {
        return repository.save(airport);
    }

    @PutMapping("/RefactorAirport/{id}") // put guarda por ubicacion (id)
    public void updateAirport(@RequestBody Airport airport, @PathVariable long id) {

        Optional<Airport> airportOptional = repository.findById(id);

        if (!airportOptional.isPresent())
            throw new ResourceNotFoundException("id-" + id);

        airport.setId(id);

        repository.save(airport);
    }

}
