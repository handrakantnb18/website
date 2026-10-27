package com.day27.javaProgramsPractice;

import java.util.*;

// How to count occurrences of each character of a String in Java 8

public class CharactersCountTestSix {

	public static void main(String[] args) {

		String someString = "CHANDRAKANT BHOSALE PUNE";

		char[] strArray = someString.toCharArray();

		Set<Character> set = new TreeSet<>();
		
		for (char c : strArray) {
			set.add(c);
		}

		for (char c : set) {

			long count = someString.chars().filter(ch -> ch == c).count();
			
			System.out.println
			("Occurances of Character '" + c + "' : " + count);
		}
	}
}
