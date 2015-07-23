package com.java8.learn.basic.lambda;

/**
 * Test {@link SingleArguPredicate} and explore the things with it which we can
 * do in a better way with java 8.
 * 
 * @author Vishal.Zanzrukia
 * @see {@link SingleArguPredicate}
 *
 */
public class SingleArguPredicateTest {

	/**
	 * Test prediction example before java 8
	 * 
	 * @param input
	 */
	private static void testSingleArguPredicateBeforeJava8(int input) {

		System.out.println(":: before java 8 single argument prediction test ::");
		// input = 16;
		/**
		 * TODO : above line will give you compile time error, because Java 8
		 * internally uses anonymous inner classes and it must be final.<BR>
		 * Reference link : http://stackoverflow.com/a/1299889/1326692
		 */
		SingleArguPredicate<Integer> isFive = new SingleArguPredicate<Integer>() {

			@Override
			public boolean predict(Integer t) {
				return input == t;
			}
		};
		System.out.println("Is " + input + " five ? : " + isFive.predict(5));

		SingleArguPredicate<Integer> isLessThanFive = new SingleArguPredicate<Integer>() {

			@Override
			public boolean predict(Integer t) {
				return input < t;
			}
		};
		System.out.println("Is " + input + " less than five ? : " + isLessThanFive.predict(5));

		System.out.println("Is " + input + " greater than five ? : " + !isLessThanFive.predict(5));
	}

	/**
	 * Test prediction example with java 8
	 * 
	 * @param input
	 */
	private static void testSingleArguPredicateWithJava8(int input) {

		System.out.println(":: with java 8 single argument prediction test ::");
		// input = 16;
		/**
		 * TODO : above line will give you compile time error, because Java 8
		 * internally uses anonymous inner classes and it must be final.<BR>
		 * Reference link : http://stackoverflow.com/a/1299889/1326692
		 */
		SingleArguPredicate<Integer> isFive = x -> input == x;
		System.out.println("Is " + input + " five ? : " + isFive.predict(5));

		SingleArguPredicate<Integer> isLessThanFive = x -> input < x;
		System.out.println("Is " + input + " less than five ? : " + isLessThanFive.predict(5));

		System.out.println("Is " + input + " greater than five ? : " + !isLessThanFive.predict(5));
	}

	public static void main(String[] args) {
		testSingleArguPredicateWithJava8(15);
		System.out.println("--------------------");
		testSingleArguPredicateBeforeJava8(15);
	}

}
