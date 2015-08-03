package com.java8.learn.domain;

import java.util.Map;
import java.util.Set;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Teacher extends Person {

	private Map<Standard, Set<Subject>> standardWiseSubjects;

	public Map<Standard, Set<Subject>> getStandardWiseSubjects() {
		return standardWiseSubjects;
	}

	public void setStandardWiseSubjects(Map<Standard, Set<Subject>> standardWiseSubjects) {
		this.standardWiseSubjects = standardWiseSubjects;
	}

}
