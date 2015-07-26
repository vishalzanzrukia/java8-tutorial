package com.java8.learn.basic.lambda;

/**
 * It's functional interface which will take one argument as input and will do
 * some operation on it and return the boolean value.<BR>
 * <BR>
 * 
 * If we declare second method in this interface then it will not be more
 * functional interface.<BR>
 * <BR>
 * 
 * <b>NOTE : </b>Java8 already contains
 * {@link java.util.function.Predicate} interface, but I have designed this
 * one to demonstrate how can we achieve the same thing before java8. So readers
 * can easily get the concept of Java8
 * 
 * @author Vishal.Zanzrukia
 *
 * @param <T>
 */
@FunctionalInterface
public interface Predicate<T> {
	/**
	 * @param t
	 * @return
	 */
	boolean test(T t);

	/**
	 * if you will declare below method, it will not allow you to use above
	 * method with lambda expression
	 */
	// void test(HashMap<String, Integer> map);
}
