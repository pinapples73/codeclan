package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.RaidRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

//    @GetMapping
//    public ResponseEntity<List<Raid>> getAllRaids(){
//        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Raid>> getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createShip(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity<>(raid, HttpStatus.CREATED);
    }
    @GetMapping
        public ResponseEntity findRaidByLocationQueryString(@RequestParam(name = "location", required = false) String location){
            if (location !=null) {
                return new ResponseEntity(raidRepository.findByLocation(location), HttpStatus.OK);
            }
            return new ResponseEntity(raidRepository.findAll(), HttpStatus.OK);
    }

}
