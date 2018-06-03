package com.example.AirportApi.Entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cabine {
    @Id
    @GeneratedValue
    private int id;
    @Basic
    private String type;
    @Basic
    private float priceMultiplier;

    public Cabine(int id, String type, float priceMultiplier) {
        this.id = id;
        this.type = type;
        this.priceMultiplier = priceMultiplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(float priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
