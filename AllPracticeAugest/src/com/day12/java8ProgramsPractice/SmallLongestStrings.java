package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallLongestStrings {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Ram", "Chandrakant","Pooja","Shivraj","Vitthal", "shyam");
		
		String minStr = 
				str.stream()
				.min(Comparator.comparing(String::length))
				.get();
		
		System.out.println("Smallest String : "+minStr);
		
		String maxStr =
				str.stream()
				.max(Comparator.comparing(String::length))
				.get();
		
		System.out.println("Largest String : "+maxStr);
		
	}
}
