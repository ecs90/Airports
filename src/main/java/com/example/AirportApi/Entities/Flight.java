package com.example.AirportApi.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Flight {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Route route;
    @OneToMany
    private List<Cabine> cabine;
    @Basic
    private float price;
    @Basic
    private String fromDate;
    @Basic
    private String toDate;

    public Flight(Long id, Route route, List<Cabine> cabine, float price, String fromDate, String toDate) {
        this.id = id;
        this.route = route;
        this.cabine = cabine;
        this.price = price;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

}
