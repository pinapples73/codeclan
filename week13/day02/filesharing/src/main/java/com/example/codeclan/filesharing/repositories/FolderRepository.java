package com.example.codeclan.filesharing.repositories;

import com.example.codeclan.filesharing.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
