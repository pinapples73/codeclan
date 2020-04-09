package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;


    @GetMapping
    public ResponseEntity findDistilleryByRegion(@RequestParam(name = "region", required = false) String region){
        if(region != null){
            return new ResponseEntity(distilleryRepository.findByRegion(region), HttpStatus.OK);
        }
        return new ResponseEntity(distilleryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/whiskies")
    public ResponseEntity findDistilleryThatHaveWhiskiesOfACertainAge(@RequestParam(name = "age", required = false) Integer age){
        if(age != null){
            return new ResponseEntity(distilleryRepository.findByWhiskiesAge(age),HttpStatus.OK);
        }
        return new ResponseEntity(distilleryRepository.findAll(), HttpStatus.OK);
    }


}
