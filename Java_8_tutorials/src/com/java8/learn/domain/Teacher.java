package com.java8.learn.domain;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Teacher extends Person {

	private Map<Standard, Set<Subject>> standardWiseSubjects;

	public Map<Standard, Set<Subject>> getStandardWiseSubjects() {
		return standardWiseSubjects;
	}

	public void add(Subject subject, Standard standard) {
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
		
		this.standardWiseSubjects.computeIfPresent(standard, (key, oldValue)-> {oldValue.add(subject);return oldValue;});
	}

	public Map<Subject, Set<Standard>> getSubjectWiseStandards() {

		if (this.standardWiseSubjects == null) {
			return null;
		}
		return this.standardWiseSubjects.entrySet()
			.parallelStream().flatMap(e -> e.getValue()
				.stream()
				.map(st -> new SimpleEntry<>(st, e.getKey())))
			.collect(Collectors.groupingBy(SimpleEntry::getKey, Collectors.mapping(SimpleEntry::getValue, Collectors.toSet())));
	}
	
	public static void main(String[] args) {
		
	}
}
