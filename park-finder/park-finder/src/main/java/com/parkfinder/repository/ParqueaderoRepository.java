package com.parkfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.parkfinder.entities.Parqueadero;


@Repository
public interface ParqueaderoRepository extends JpaRepository<Parqueadero, Long> {
    
}