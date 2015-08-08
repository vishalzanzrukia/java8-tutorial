package com.java8.learn.basic.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.learn.data.DataProvider;
import com.java8.learn.domain.Employee;

public class Test {
	public static void main(String[] args) {
		DataProvider.getEmployees().stream().filter(emp -> {
			System.out.println(emp.getName());
			return emp.getName().equals("0 : name");
		});

		/**
		 * TODO : There are two types of operations stream API perform : LAZY,
		 * EAGER <br>
		 * 
		 * It’s very easy to figure out whether an operation is eager or lazy:
		 * look at what it returns. If it gives you back a Stream, it’s lazy; if
		 * it gives you back another value or void, then it’s eager.<br>
		 * 
		 * This makes sense because the preferred way of using these methods is
		 * to form a sequence of lazy operations chained together and then to
		 * have a single eager operation at the end that generates your result.
		 * 
		 * in above example filter returns Stream, so it's lazy, that's why it's
		 * not printing anything until we call any eager operation like
		 * count(note that, it's returns long)
		 * 
		 */

		long count = DataProvider.getEmployees().stream().filter(emp -> {
			System.out.println(emp.getName());
			return emp.getName().equals("0 : name");
		}).count();

		/** get set from collect */
		Set<Employee> set = DataProvider.getEmployees().stream().filter(emp -> {
			System.out.println(emp.getName());
			return emp.getName().equals("0 : name");
		}).collect(Collectors.toSet());

		/** get list from collect */
		List<Employee> list = DataProvider.getEmployees().stream().filter(emp -> {
			System.out.println(emp.getName());
			return emp.getName().equals("0 : name");
		}).collect(Collectors.toList());

		System.out.println("count : " + count);
	}
}
