package com.java8.learn.domain;

import java.util.HashMap;
import java.util.HashSet;
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

	public void addStandardWiseSubject(Subject subject, Standard standard) {
		if (this.standardWiseSubjects == null) {
			this.standardWiseSubjects = new HashMap<>();
		}
		if (this.standardWiseSubjects.containsKey(standard)) {
			this.standardWiseSubjects.get(standard).add(subject);
		} else {
			Set<Subject> subjects = new HashSet<>();
			subjects.add(subject);
			this.standardWiseSubjects.put(standard, subjects);
		}
	}
}
