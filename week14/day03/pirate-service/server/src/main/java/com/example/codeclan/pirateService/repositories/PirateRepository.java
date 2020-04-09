package com.example.codeclan.pirateService.repositories;

import com.example.codeclan.pirateService.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

//    operation<object>By<property><operator>where:
    List<Pirate> findPirateByFirstName(String firstName);

    List findByAgeGreaterThan(int age);

    List findByAgeGreaterThanEqualAndAgeLessThanEqual(int ageGreater, int ageLess);
}
