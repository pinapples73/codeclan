package com.example.codeclan.departmentdata.repositories;

import com.example.codeclan.departmentdata.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
