package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStrings {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("chandrakant", "priyanka",
				"Shivraj","Bhosale", "Pilly");
		
		List<String> unique = list.stream().collect(Collectors.toList());
		
		System.out.println(unique);		
	}
}
