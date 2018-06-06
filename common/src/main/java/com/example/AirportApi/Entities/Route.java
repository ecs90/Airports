package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Route { //Falta editar el @Basic de from/toAp por @OneToOne, @OneToMany o el que sea
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Airport fromAp;
    @ManyToOne
    private Airport toAp;
    @Basic
    private float price;

    public Route(Long id, Airport fromAp, Airport toAp, float price){
        this.id = id;
        this.fromAp = fromAp;
        this.toAp = toAp;
        this.price = price;
    }

}
