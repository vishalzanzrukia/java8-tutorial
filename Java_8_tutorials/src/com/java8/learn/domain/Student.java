package com.java8.learn.domain;

import java.util.Set;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Student extends Person {

	private Set<Subject> subjects;

	private Standard standard;

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}
}
