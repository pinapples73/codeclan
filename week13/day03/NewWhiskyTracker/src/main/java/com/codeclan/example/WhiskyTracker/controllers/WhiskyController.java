package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping
    public ResponseEntity findWhiskyByVariousMethods(
            @RequestParam(required = false, name = "year") Integer year,
            @RequestParam(required = false, name = "distillery") String distName,
            @RequestParam(required = false, name = "age") Integer age,
            @RequestParam(required = false, name = "region") String region
    ){
        if(year != null){
            return new ResponseEntity(whiskyRepository.findByYear(year), HttpStatus.OK);
        }
        if(distName != null && age != null){
            return new ResponseEntity(whiskyRepository.findByDistilleryNameAndAge(distName, age), HttpStatus.OK);
        }
        if(region != null){
            return new ResponseEntity(whiskyRepository.findByDistilleryRegion(region), HttpStatus.OK);
        }
        return new ResponseEntity(whiskyRepository.findAll(), HttpStatus.OK);
    }


}
