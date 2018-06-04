package com.example.AirportApi.Entities;

import javax.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private Rout rout;
    @OneToMany
    private Cabine cabine;
    @Basic
    private float price;
    @Basic
    private String fromDate;
    @Basic
    private String toDate;

    public Flight(int id, Rout rout, Cabine cabine, float price, String fromDate, String toDate) {
        this.id = id;
        this.rout = rout;
        this.cabine = cabine;
        this.price = price;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rout getRout() {
        return this.rout;
    }

    public void setRout(Rout rout) {
        this.rout = rout;
    }

    public Cabine getCabine() {
        return this.cabine;
    }

    public void setCabine(Cabine cabine) {
        this.cabine = cabine;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
