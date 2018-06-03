package com.example.AirportApi.Entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rout {
    @Id
    @GeneratedValue
    private int id;
    @Basic
    private Airport fromAp;
    @Basic
    private Airport toAp;
    @Basic
    private float price;

    public Rout(int id, Airport fromAp, Airport toAp, float price){
        this.id = id;
        this.fromAp = fromAp;
        this.toAp = toAp;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setFromAp(Airport fromAp){
        this.fromAp = fromAp;
    }

    public Airport getFromAp(){
        return this.fromAp;
    }

    public void setToAp(Airport toAp){
        this.toAp = toAp;
    }

    public Airport getToAp() {
        return this.toAp;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }
}
