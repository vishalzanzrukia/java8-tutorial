package com.java8.learn.basic.lambda;

import java.text.SimpleDateFormat;
import java.util.function.Supplier;

import javax.swing.JButton;

class MySupplier implements Supplier<SimpleDateFormat>{

	@Override
	public SimpleDateFormat get() {
		return new SimpleDateFormat("yyyyMMdd HHmm");
	}
	
}
public class Test {
	public static void main(String[] args) {

		JButton button = new JButton();
		button.addActionListener(event ->
		System.out.println(event.getActionCommand()));
	}
}
