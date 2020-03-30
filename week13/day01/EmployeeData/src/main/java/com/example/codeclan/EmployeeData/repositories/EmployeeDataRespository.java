package com.example.codeclan.EmployeeData.repositories;

import com.example.codeclan.EmployeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDataRespository extends JpaRepository<Employee, Long> {
}
