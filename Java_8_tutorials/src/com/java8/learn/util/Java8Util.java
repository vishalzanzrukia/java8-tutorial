package com.java8.learn.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author VishalZanzrukia
 *
 */
public class Java8Util {

	public static String textToHtml(String filePath) {
		return null;
	}
	
	public static <T> void forEachConditional(Iterable<T> source, Predicate<T> action) {
		for (T item : source) {
			if (!action.test(item)) {
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
	}

}
