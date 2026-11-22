package com.day20.java;

//Using StringBuilder : Write a Java program to reverse a given string.

public class ReverseString {

	public static void main(String[] args) {

		String str = "Chandrakant bhosale";

		String reverse = 
				new StringBuilder(str)
				.reverse()
				.toString();

		System.out.println("Original String : " + str);

		System.out.println("Reverse String  : " + reverse);

	}
}
