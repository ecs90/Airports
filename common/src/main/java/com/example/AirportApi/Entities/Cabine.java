package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cabine {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String type;
    @Basic
    private float priceMultiplier;

    public Cabine(Long id, String type, float priceMultiplier) {
        this.id = id;
        this.type = type;
        this.priceMultiplier = priceMultiplier;
    }

}
