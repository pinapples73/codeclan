package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    //JPA Derived Query looks at the method name
    // depending on how method name is structured it will generate
    // a query from the name

    //Lets try finding all the pirtaes with first name eg. find all pirates with firs_name colin
    //"What do I want back?" - List<Pirate>
    //"What data do I have?" - String name = "colin"

    //operation<object>By<property><operator> where:
    // operation:  find(read get etc)   count
    //object:   most cases the class your getting back (optional)
    //property: property the object has eg firstName

    List<Pirate> findPirateByFirstName(String first_name);

    //write a query to find all pirates OVER a certain age
    List<Pirate> findByAgeGreaterThan(int age);

    List<Pirate> findByAgeGreaterThanEqualAndAgeLessThanEqual(int ageGreater, int ageLess);

}
