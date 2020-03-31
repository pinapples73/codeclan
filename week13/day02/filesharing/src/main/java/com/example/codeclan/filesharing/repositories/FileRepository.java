package com.example.codeclan.filesharing.repositories;

import com.example.codeclan.filesharing.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
