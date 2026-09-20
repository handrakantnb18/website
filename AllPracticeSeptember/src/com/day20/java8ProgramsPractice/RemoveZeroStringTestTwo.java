package com.day20.java8ProgramsPractice;

//Java's String.replaceFirst() can be used with a regular expression to remove leading zeros

public class RemoveZeroStringTestTwo {

	static String removeLeadingZeros(String str) {

		String result = str.replaceFirst("^0+", "");

		return result.isEmpty() ? "0" : result;
	}

	public static void main(String[] args) {

		String str = "000012356090";

		System.out.println("Original String: " + str);
		System.out.println("String after removing leading zeros: " + removeLeadingZeros(str));

	}

}
