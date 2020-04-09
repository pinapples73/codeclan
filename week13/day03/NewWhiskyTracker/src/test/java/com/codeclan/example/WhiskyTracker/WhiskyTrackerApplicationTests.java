package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindWhiskeyByYear(){
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(1995);
	}

	@Test
	public void canFindDistilleriesByRegion(){
		List<Distillery> foundDistilleries = distilleryRepository.findByRegion("Speyside");
	}

	@Test
	public void canFindWhiskiesByAge(){
		List<Whisky> foundWhiskies = whiskyRepository.findByDistilleryNameAndAge("Glendronach", 15);
	}

}
