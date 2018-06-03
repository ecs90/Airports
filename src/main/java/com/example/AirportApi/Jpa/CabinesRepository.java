package com.example.AirportApi.Jpa;

import com.example.AirportApi.Entities.Cabine;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface CabinesRepository extends JpaRepository<Cabine, Long>{

}
