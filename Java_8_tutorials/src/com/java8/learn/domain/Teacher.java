package com.java8.learn.domain;

import java.util.AbstractMap;
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

	// I need some inputs over here.
	public Map<Subject, Set<Standard>> getSubjectWiseStandards() {

		if (this.standardWiseSubjects == null) {
			return null;
		}

		Map<Subject, Set<Standard>> output = new HashMap<>();

		this.standardWiseSubjects.values().parallelStream().flatMap(set -> set.stream()).forEach(subject -> {
			Set<Standard> standards = new HashSet<>();
			this.standardWiseSubjects.forEach((standard, subjects) -> {
				// TODO can I convert this if condition into predicate?
				if (subjects.contains(subject)) {
					standards.add(standard);
				}
			});
			output.put(subject, standards);
		});

		// return output;

		this.standardWiseSubjects.values().parallelStream().flatMap(set -> set.stream());
		
		return this.standardWiseSubjects.entrySet().parallelStream().<Map.Entry<Subject, Standard>> flatMap(
						e -> e.getValue().stream().map(st -> new AbstractMap.SimpleEntry<>(st, e.getKey())))
				.collect(Collectors.groupingBy(e -> e.getKey(),
						Collectors.mapping(e -> e.getValue(), Collectors.toSet())));
	}
}
