package com.day15.java8ProgramsPractice;

// string comparison using the equals (==) operator.

public class EqualsOperatorTest {

	public static void main(String[] args) {

		String s1 = "Jack";
		String s2 = "Jack";
		String s3 = new String("Jack");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
	}
}
