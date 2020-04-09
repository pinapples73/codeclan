package com.example.codeclan.pirateService.controllers;

import com.example.codeclan.pirateService.models.Pirate;
import com.example.codeclan.pirateService.models.Raid;
import com.example.codeclan.pirateService.repositories.PirateRepository;
import com.example.codeclan.pirateService.repositories.RaidRepository;
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

    @GetMapping("{id}")
    public ResponseEntity<Optional<Raid>> getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity(raid,HttpStatus.CREATED);
    }

//    @GetMapping(value = "/location")
//    public ResponseEntity filterRaidByLocation(@RequestParam(name="located")String located){
//        return new ResponseEntity(raidRepository.findRaidByLocation(located),HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity findRaidsFilterByLocation(@RequestParam(name = "location", required = false)String location){
        if(location !=null){
            return new ResponseEntity(raidRepository.findRaidByLocation(location), HttpStatus.OK);
        }
        return new ResponseEntity(raidRepository.findAll(), HttpStatus.OK);
    }




//    @GetMapping(value = "/pirates")
//    public ResponseEntity findShipsThatHavePiratesNamedQueryString(@RequestParam(name="named")String name){
//        return new ResponseEntity(shipRepository.findByPiratesFirstName(name),HttpStatus.OK);
//    }

}
