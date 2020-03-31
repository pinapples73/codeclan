package com.example.codeclan.departmentdata.repositories;

import com.example.codeclan.departmentdata.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
