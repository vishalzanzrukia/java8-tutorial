package com.java8.learn.basic.lambda;

/**
 * It's functional interface which will take one argument as input and will do
 * some operation on it and return the boolean value<BR>
 * If we declare second method in this interface then it will not be more
 * functional interface.
 * 
 * @author Vishal.Zanzrukia
 *
 * @param <T>
 */
@FunctionalInterface
public interface SingleArguPredicate<T> {
	/**
	 * @param t
	 * @return
	 */
	boolean predict(T t);

	/**
	 * if you will declare below method, it will not allow you to use above
	 * method with lambda expression
	 */
	// void test(HashMap<String, Integer> map);
}
