package com.example.codeclan.departmentdata.controllers;

import com.example.codeclan.departmentdata.models.Department;
import com.example.codeclan.departmentdata.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
