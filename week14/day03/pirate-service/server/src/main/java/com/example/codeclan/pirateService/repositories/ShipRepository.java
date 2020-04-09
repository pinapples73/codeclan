package com.example.codeclan.pirateService.repositories;

import com.example.codeclan.pirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {

    List<Ship> findByPiratesFirstName(String firstName);

}
