package com.example.codeclan.pirateService;

import com.example.codeclan.pirateService.models.Pirate;
import com.example.codeclan.pirateService.models.Raid;
import com.example.codeclan.pirateService.models.Ship;
import com.example.codeclan.pirateService.repositories.PirateRepository;
import com.example.codeclan.pirateService.repositories.RaidRepository;
import com.example.codeclan.pirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PirateServiceApplicationTests {

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
		Ship ship = new Ship("shippy");
		shipRepository.save(ship);
		Pirate jack = new Pirate("Jack","Sparrow",32,ship);
		pirateRepository.save(jack);
		Pirate jack2 = new Pirate("Jack","Bob",22,ship);
		pirateRepository.save(jack2);

	}

	@Test
	public void canFindPirateByName(){
		List<Pirate> foundPirates = pirateRepository.findPirateByFirstName("Jack");
		assertEquals(2,foundPirates.size());
		assertEquals("Jack",foundPirates.get(0).getFirstName());
	}


	@Test
	public void canFindPiratesOverCertainAge(){
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThan(23);
		assertEquals(1,foundPirates.size());
	}

	@Test
	public void canFindPiratesOverAgeAndUnderAge(){
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(35,55);
		assertEquals(6,foundPirates.size());

	}

	@Test
	public void canFindRaidsByPiratesByShip(){
		List<Raid> foundRaids = raidRepository.findByPiratesShipName("The Black Pig");
		assertEquals(1,foundRaids.size());
	}
}
