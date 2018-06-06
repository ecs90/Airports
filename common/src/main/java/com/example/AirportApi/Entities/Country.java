package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String name;
    @Basic
    private String isoCode;

    public Country(Long id, String name, String isoCode) {
        this.id = id;
        this.name = name;
        this.isoCode = isoCode;
    }

}
