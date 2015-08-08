package com.java8.learn.data;

import java.util.ArrayList;
import java.util.List;

import com.java8.learn.domain.Developer;
import com.java8.learn.domain.Employee;

/**
 * @author VishalZanzrukia
 *
 */
public class DataProvider {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			employees.add(new Employee(i + " : name"));
		}

		return employees;
	}

	/**
	 * @return
	 */
	public static List<Developer> getDevelopers() {
		List<Developer> developers = new ArrayList<>();
		Developer vishal = new Developer("vishal");
		vishal.addSkill("Java");
		vishal.addSkill("Scala");
		vishal.addSkill("Play");
		vishal.addSkill("Spring");
		developers.add(vishal);
		
		Developer neha = new Developer("neha");
		neha.addSkill("Java");
		neha.addSkill("Ruby");
		developers.add(neha);
		
		Developer chirag = new Developer("chirag");
		chirag.addSkill("Hibernate");
		chirag.addSkill("Rails");
		chirag.addSkill("Ruby");
		developers.add(chirag);
		
		return developers;

	}

}
