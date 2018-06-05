package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface RoutesRepository extends JpaRepository<Route,Long> {

}
