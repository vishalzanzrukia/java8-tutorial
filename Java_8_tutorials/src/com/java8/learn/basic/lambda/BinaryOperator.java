package com.java8.learn.basic.lambda;

/**
 * It's functional interface which will take two arguments as inputs and will do
 * some operation on it and return the final produced value<BR>
 * If we declare second method in this interface then it will not be more
 * functional interface.
 * 
 * @author Vishal.Zanzrukia
 *
 * @param <K>
 */
@FunctionalInterface
public interface BinaryOperator<K> {
	/**
	 * @param t
	 * @param v
	 * @return
	 */
	K getResult(K t, K v);

	/**
	 * if you will declare below method, it will not allow you to use above
	 * method with lambda expression
	 */
	// void test(HashMap<String, Integer> map);
}
