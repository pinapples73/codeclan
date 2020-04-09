package com.example.codeclan.pirateService.repositories;

import com.example.codeclan.pirateService.models.Raid;
import com.example.codeclan.pirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {

    List<Raid> findByPiratesShipName(String name);

    List<Raid> findByPiratesRaidsLocation(String location);

    List<Raid> findRaidByLocation(String location);

}
