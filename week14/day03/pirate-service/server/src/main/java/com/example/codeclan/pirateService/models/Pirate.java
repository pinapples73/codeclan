package com.example.codeclan.pirateService.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pirates")
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @JsonIgnoreProperties("pirates")
    @ManyToOne
    @JoinColumn(name = "ship_id",nullable = false)
    private Ship ship;
//    @JsonIgnore
    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "pirates_raids",
            joinColumns = {@JoinColumn(
                    name="pirate_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false
            )}
    )




    private List<Raid> raids;

//    POJO (Plain Old Java Object)
//    All attributes saved to the db should be private and have getters and setters
//    Need a default constructor
//    Need Long id.


    public Pirate(String firstName,String lastName, int age, Ship ship){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.ship=ship;
        this.raids=new ArrayList<>();
    }

    public Pirate(){

    }

//    getters
    public int getAge() { return age; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Ship getShip() { return ship; }
    public List<Raid> getRaids() { return raids; }

    public Long getId() { return id; }

    //    setters
    public void setAge(int age) { this.age = age; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setShip(Ship ship) { this.ship = ship; }
    public void setRaids(List<Raid> raids) { this.raids = raids; }

    public void addRaid(Raid raid){this.raids.add(raid);}
    public void removeRaid(Raid raid){this.raids.remove(raid);}

    public void setId(Long id) { this.id = id; }


}
