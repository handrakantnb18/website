package com.day5.java;

// New Features in String API

public class StringFeaturesDemo {

	public static void main(String[] args) {

		String multiline = """
				Line 1
				    Line 2
				        Line 3
				""";

		System.out.println("Original:\n" + multiline);
		System.out.println("After stripIndent:\n" + multiline.stripIndent());

	}
}
