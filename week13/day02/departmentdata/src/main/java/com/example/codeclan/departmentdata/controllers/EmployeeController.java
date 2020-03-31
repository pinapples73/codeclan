package com.example.codeclan.departmentdata.controllers;

import com.example.codeclan.departmentdata.models.Employee;

import com.example.codeclan.departmentdata.repositories.EmployeeRepository;
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
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllDepartments(){
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getDepartmentById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
