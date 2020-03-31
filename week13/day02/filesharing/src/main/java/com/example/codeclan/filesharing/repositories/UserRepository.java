package com.example.codeclan.filesharing.repositories;

import com.example.codeclan.filesharing.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
