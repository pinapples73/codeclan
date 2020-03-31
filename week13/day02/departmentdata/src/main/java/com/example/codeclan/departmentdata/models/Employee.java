package com.example.codeclan.departmentdata.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "employee_number")
    private String employeeNumber;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Project> projects;


    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee(String first_name, String last_name, String employeeNumber, Department department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.employeeNumber = employeeNumber;
        this.projects = new ArrayList<>();
        this.department = department;
    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }

    public void addDepartmentId(Department department){
        this.department = department;
    }

}
