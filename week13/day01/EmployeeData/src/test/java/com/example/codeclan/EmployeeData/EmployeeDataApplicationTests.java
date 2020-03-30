package com.example.codeclan.EmployeeData;

import com.example.codeclan.EmployeeData.models.Employee;
import com.example.codeclan.EmployeeData.repositories.EmployeeDataRespository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Autowired
	EmployeeDataRespository employeeDataRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee bob = new Employee("bob", 24, 100, "bob@email.com");
		employeeDataRespository.save(bob);
	}

}
