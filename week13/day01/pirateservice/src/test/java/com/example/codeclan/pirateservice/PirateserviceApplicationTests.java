package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);
		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);
	}

	@Test
	public void addPiratesAndRaids(){
		Ship ship = new Ship("The Black Pearl");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Raid raid1 = new Raid("Tortuga", 100);
		raidRepository.save(raid1);

		raid1.addPirate(pirate1);
		raidRepository.save(raid1);
	}

	@Test
	public void canFindPirateByFirstName(){
		List<Pirate> foundPirates = pirateRepository.findPirateByFirstName("Bartholomew");
		assertEquals("Bartholomew", foundPirates.get(0).getFirstName());
	}

	@Test
	public void canFindPiratesOverAge(){
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThan(35);
	}

	@Test
	public void canFindPiratesOverAgeAndUnderAge(){
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(35, 55);
	}

	@Test
	public void canFindShipsByPiratesFirstName(){
		List<Ship> foundShips = shipRepository.findByPiratesFirstName("Jack");

	}

	@Test
	public void canFindRaidByShipName(){
		List<Raid> foundRaids = raidRepository.findByPiratesShipName("The Black Pig");
	}

}
