package com.example.codeclan.departmentdata;

import com.example.codeclan.departmentdata.models.Department;
import com.example.codeclan.departmentdata.models.Employee;
import com.example.codeclan.departmentdata.models.Project;
import com.example.codeclan.departmentdata.repositories.DepartmentRepository;
import com.example.codeclan.departmentdata.repositories.EmployeeRepository;
import com.example.codeclan.departmentdata.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DepartmentdataApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Goods" );
		departmentRepository.save(department);

		Employee jimBob = new Employee("Jim", "Bob", "U123456", department);
		employeeRepository.save(jimBob);

		assertEquals("Jim", jimBob.getFirst_name());
		assertEquals("U123456", jimBob.getEmployeeNumber());
	}

	@Test
	public void createEmployeesAndProjects(){
		Department department = new Department("Services" );
		departmentRepository.save(department);

		Employee jimBob = new Employee("Jim", "Bob", "U123456", department);
		employeeRepository.save(jimBob);

		Employee sueEllen = new Employee("Sue", "Ellen", "U678901", department);
		employeeRepository.save(sueEllen);

		Project project1 = new Project("Cool Project", 7);
		projectRepository.save(project1);

		Project project2 = new Project("Super Cool Project", 14);
		projectRepository.save(project2);

		jimBob.addProject(project1);
		jimBob.addProject(project2);
		employeeRepository.save(jimBob);

		sueEllen.addProject(project2);
		employeeRepository.save(sueEllen);
	}

}
