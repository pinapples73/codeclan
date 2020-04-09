package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

    List<Distillery> findByRegion(String region);

    List<Distillery> findByWhiskiesAge(Integer age);

 }
