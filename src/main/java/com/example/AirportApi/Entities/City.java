package com.example.AirportApi.Entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue
    private int id;
    @Basic
    private String name;
    @Basic
    private String iataCode;
    @Basic
    private Country country;

    public City(int id, String name, String iataCode, Country country) {
        this.id = id;
        this.name = name;
        this.iataCode = iataCode;
        this.country = country;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIataCode() {
        return this.iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
