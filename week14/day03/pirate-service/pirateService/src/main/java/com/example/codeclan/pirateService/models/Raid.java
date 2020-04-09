package com.example.codeclan.pirateService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "raids")
public class Raid {

    public Raid(String location, int loot){
        this.location=location;
        this.loot=loot;
        this.pirates= new ArrayList<>();
    }

    public Raid(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "location")
    private String location;
    @Column(name = "loot")
    private int loot;
    @JsonIgnoreProperties("raid")
    @ManyToMany
    @JoinTable(
            name = "pirates_raids",
            joinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
            name = "pirate_id",
            nullable = false,
            updatable = false
    )}
    )
    private List<Pirate> pirates;

//    getters
    public Long getId() { return id; }
    public int getLoot() { return loot; }
    public List<Pirate> getPirates() { return pirates; }
    public String getLocation() { return location; }

//    setters
    public void setPirates(List<Pirate> pirates) { this.pirates = pirates; }
    public void setId(Long id) { this.id = id; }
    public void setLocation(String location) { this.location = location; }
    public void setLoot(int loot) { this.loot = loot; }

    public void addPirate(Pirate pirate){this.pirates.add(pirate);}
    public void removePirate(Pirate pirate){this.pirates.remove(pirate);}

}
