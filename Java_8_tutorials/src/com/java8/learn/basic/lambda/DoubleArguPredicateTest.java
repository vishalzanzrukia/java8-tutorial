package com.java8.learn.basic.lambda;

/**
 * Test {@link DoubleArguPredicate} and explore the things with it which we can
 * do in a better way with java 8.
 * 
 * @author Vishal.Zanzrukia
 * @see {@link DoubleArguPredicate}
 *
 */
public class DoubleArguPredicateTest {

	/**
	 * Test double argument prediction example before java 8
	 * 
	 * @param input1
	 * @param input2
	 */
	private static void testDoubleArguPredicateBeforeJava8(int input1, int input2) {

		System.out.println(":: before java 8 double argument prediction test ::");
		// input1 = 16; input2 = 16;
		/**
		 * NOTE : above line will give you compile time error, because Java 8
		 * internally uses anonymous inner classes and it must be final.<BR>
		 * Reference link : http://stackoverflow.com/a/1299889/1326692
		 */

		DoubleArguPredicate<Integer> isEqual = new DoubleArguPredicate<Integer>() {

			@Override
			public boolean predict(Integer t, Integer v) {
				return t.intValue() == v.intValue();
			}
		};

		System.out.println("Is " + input1 + " and " + input2 + " are equal ? : " + isEqual.predict(input1, input2));

		DoubleArguPredicate<Integer> isInput1Greater = new DoubleArguPredicate<Integer>() {

			@Override
			public boolean predict(Integer t, Integer v) {
				return t.intValue() > v.intValue();
			}
		};

		System.out.println(
				"Is " + input1 + " is greater than " + input2 + " ? : " + isInput1Greater.predict(input1, input2));

		System.out.println(
				"Is " + input2 + " is greater than " + input1 + " ? : " + isInput1Greater.predict(input2, input1));
	}

	/**
	 * 
	 */
	/**
	 * Test double argument prediction example with java 8
	 * 
	 * @param input1
	 * @param input2
	 */
	private static void testDoubleArguPredicateWithJava8(int input1, int input2) {

		System.out.println(":: with java 8 double argument prediction test ::");
		// input1 = 16; input2 = 16;
		/**
		 * NOTE : above line will give you compile time error, because Java 8
		 * internally uses anonymous inner classes and it must be final.<BR>
		 * Reference link : http://stackoverflow.com/a/1299889/1326692
		 */
		DoubleArguPredicate<Integer> isEqual = (x, y) -> x.intValue() == y.intValue();
		System.out.println("Is " + input1 + " and " + input2 + " are equal ? : " + isEqual.predict(input1, input2));

		DoubleArguPredicate<Integer> isInput1Greater = (x, y) -> x.intValue() > y.intValue();
		System.out.println(
				"Is " + input1 + " is greater than " + input2 + " ? : " + isInput1Greater.predict(input1, input2));

		System.out.println(
				"Is " + input2 + " is greater than " + input1 + " ? : " + isInput1Greater.predict(input2, input1));

	}

	public static void main(String[] args) {
		testDoubleArguPredicateWithJava8(5, 6);
		System.out.println("----------------------");
		testDoubleArguPredicateBeforeJava8(5, 6);
	}

}
