package com.day17.java;

//Write a Java program to show a NullPointerException

public class NullPointerException {

	public static void main(String[] args) {
		printString(null, 3);

	}

	static void printString(String s, int count) {
		for (int i = 0; i < count; i++) {

			System.out.println(s.toUpperCase());
		}
	}

}
