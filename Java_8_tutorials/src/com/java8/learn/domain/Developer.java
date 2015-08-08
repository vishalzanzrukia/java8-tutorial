package com.java8.learn.domain;

import java.util.HashSet;
import java.util.Set;

public class Developer {

	private String name;
	private Set<String> skills;

	public Developer(String name) {
		this.skills = new HashSet<>();
		this.name = name;
	}

	public void addSkill(String skill) {
		this.skills.add(skill);
	}

	public Set<String> getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
