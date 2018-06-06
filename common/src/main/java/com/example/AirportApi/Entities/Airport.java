package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Airport {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String name;
    @ManyToOne
    private City city;
    @Basic
    private float latitude;
    @Basic
    private float longitude;

    public Airport(Long id, String name, City city, float latitude, float longitude) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
