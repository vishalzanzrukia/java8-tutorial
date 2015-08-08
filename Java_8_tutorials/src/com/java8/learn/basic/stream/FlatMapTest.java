package com.java8.learn.basic.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.learn.data.DataProvider;
import com.java8.learn.domain.Developer;

/**
 * @author VishalZanzrukia
 *
 */
public class FlatMapTest {
	/**
	 * 
	 */
	public static void testFlatMapWithJava8() {

		List<Developer> team = DataProvider.getDevelopers();

		List<Developer> javaDevelopers = team.stream().filter(d -> d.getSkills().contains("Java"))
				.collect(Collectors.toList());

		/**
		 * <pre>
		 * TODO : below line takes consumer as input, consumes only consumes, return type is void
		 * </pre>
		 */
		javaDevelopers.forEach(dev -> System.out.println(dev));
		System.out.println("-------------------");

		/**
		 * <pre>
		 * TODO : It's not defined which implementation of set Collectors.toSet uses internally, but we can always give the implementation type, refer below line.
		 * </pre>
		 * */
		Set<String> distinctSkillsHashSet = team.stream().map(dev -> dev.getSkills()).flatMap(l -> l.stream()).collect(Collectors.toCollection(()-> new HashSet<>()));
		/**
		 * <pre>
		 * TODO : Use-case of :: for constructor calling (HashSet::new), which can be done with typical lambda expression as well (as given in above line)
		 * TODO : Use-case of :: for default interface method calling (Collection::stream), which can be done with typical lambda expression as well (like, set -> set.stream())
		 * </pre>
		 * */
		Set<String> distinctSkillsHashSet2 = team.stream().map(dev -> dev.getSkills()).flatMap(Collection::stream).collect(Collectors.toCollection(HashSet::new));
		
		distinctSkillsHashSet2.forEach(System.out::println);
		
		System.out.println("-------------------");
		List<String> distinctSkillsWithSameOrder = team.stream().map(dev -> dev.getSkills()).flatMap(set -> set.stream()).distinct().collect(Collectors.toList());
		
		/**
		 * <pre>
		 * TODO : Use-case of :: static method calling, which can be done with typical lambda expression as well
		 * </pre>
		 * */
		distinctSkillsWithSameOrder.forEach(System.out::println);
	}

	public static void main(String[] args) {
		testFlatMapWithJava8();
	}
}
