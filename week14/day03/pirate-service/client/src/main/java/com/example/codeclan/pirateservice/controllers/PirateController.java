package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

//    @GetMapping
//    public ResponseEntity<List<Pirate>> getAllPirates(){
//        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pirate>> getPirate(@PathVariable Long id){
        return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return new ResponseEntity(pirate, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getByAgeGreaterOrLessThan(
            @RequestParam(required = false, name = "ageGreater") int ageGreater,
            @RequestParam(required = false, name = "ageLess") int ageLess
    ){
        if(ageGreater > 0 && ageLess > 0) {
            return new ResponseEntity(pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(ageGreater, ageLess), HttpStatus.OK);
        }
        return new ResponseEntity(pirateRepository.findAll(), HttpStatus.OK);
    }

}
