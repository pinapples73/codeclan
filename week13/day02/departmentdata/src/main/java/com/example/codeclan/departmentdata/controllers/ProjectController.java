package com.example.codeclan.departmentdata.controllers;

import com.example.codeclan.departmentdata.models.Project;
import com.example.codeclan.departmentdata.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllDepartments(){
        return projectRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Project> getDepartmentById(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
