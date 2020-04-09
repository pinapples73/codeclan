package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ships")
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping
    public ResponseEntity<List<Ship>> getAllShips() {
        return new ResponseEntity<>(shipRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Ship>> getShip(@PathVariable Long id) {
        return new ResponseEntity<>(shipRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createShip(@RequestBody Ship ship){
        shipRepository.save(ship);
        return new ResponseEntity<>(ship, HttpStatus.CREATED);
    }

    @GetMapping(value="/pirates/named/{name}")
    public List<Ship> findShipsThatHavePiratesName(@PathVariable String name){
        return shipRepository.findByPiratesFirstName(name);
    }

    @GetMapping(value="/pirates")
    public ResponseEntity findShipsThatHavePiratesNamedQueryString(@RequestParam(name="named") String name){
        return new ResponseEntity(shipRepository.findByPiratesFirstName(name), HttpStatus.OK);
    }


}
