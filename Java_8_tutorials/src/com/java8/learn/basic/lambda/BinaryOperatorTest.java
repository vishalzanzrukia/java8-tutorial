package com.java8.learn.basic.lambda;

/**
 * Test {@link BinaryOperator} and explore the things with it which we can do in
 * a better way with java 8.
 * 
 * @author Vishal.Zanzrukia
 * @see {@link BinaryOperator}
 *
 */
public class BinaryOperatorTest {

	/**
	 * Test binary operator before java 8
	 * 
	 * @param input1
	 * @param input2
	 */
	private static void testBinaryOperatorBeforeJava8(Integer input1, Integer input2) {
		System.out.println("Test binary operator before java 8");

		BinaryOperator<Integer> addition = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer v) {
				return t + v;
			}
		};

		System.out.println(input1 + " + " + input2 + " : " + addition.apply(input1, input2));

		BinaryOperator<Long> subtraction = new BinaryOperator<Long>() {

			@Override
			public Long apply(Long t, Long v) {
				return t - v;
			}
		};

		System.out.println(input1 + " - " + input2 + " : " + subtraction.apply(new Long(input1), new Long(input2)));
	}

	/**
	 * Test binary operator with java 8
	 * 
	 * @param input1
	 * @param input2
	 */
	private static void testBinaryOperatorWithJava8(Integer input1, Integer input2) {

		System.out.println("Test binary operator with java 8");
		/**
		 * Note that we have declared Integer in below example in
		 * lambda-expression, but it's not compulsory
		 */
		
		java.util.function.BinaryOperator<Integer> addition = (Integer x, Integer y) -> x + y;
		System.out.println(input1 + " + " + input2 + " : " + addition.apply(input1, input2));

		/**
		 * Note that we have not declared Long in below example in
		 * lambda-expression and it would work perfectly..!
		 */
		java.util.function.BinaryOperator<Long> subtraction = (x, y) -> x - y;
		System.out.println(input1 + " - " + input2 + " : " + subtraction.apply(new Long(input1), new Long(input2)));
	}

	public static void main(String[] args) {
		testBinaryOperatorWithJava8(15, 10);
		System.out.println("------------------------");
		testBinaryOperatorBeforeJava8(15, 10);
	}
}
