package com.java8.learn.domain;

/**
 * @author VishalZanzrukia
 *
 */
public class Employee {

	public Employee(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
