package com.day22.java8ProgramsPractice;

// Immutable String
// String: An immutable sequence of characters used to store text in Java.

public class DSAListTestFour {

	public static void main(String[] args) {

		String s = "Chandrakant bhosale";
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" chandrakant");
		System.out.println(sb.toString());

	}
}
