package com.day20.java8ProgramsPractice;

//The for loop is the most basic and manual approach. 

public class ReverseStringTestOne {

	public static void main(String[] args) {

		String str = "chandrakant";

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;

		}

		System.out.println(rev);
	}
}
