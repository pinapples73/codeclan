package com.example.codeclan.EmployeeData.controllers;

import com.example.codeclan.EmployeeData.models.Employee;
import com.example.codeclan.EmployeeData.repositories.EmployeeDataRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    EmployeeDataRespository employeeDataRespository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeDataRespository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeDataRespository.findById(id);
    }
}
