package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String name;
    @Basic
    private String iataCode;
    @ManyToOne
    private Country country;

    public City(Long id, String name, String iataCode, Country country) {
        this.id = id;
        this.name = name;
        this.iataCode = iataCode;
        this.country = country;
    }

}
