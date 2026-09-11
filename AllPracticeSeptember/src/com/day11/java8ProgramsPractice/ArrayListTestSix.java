package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// This method takes a single parameter, the object to be checked if it is present in the list.

public class ArrayListTestSix {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ajit");
		list.add("Arya");
		list.add("Amit");
		list.add("Ananya");
		list.add("Anil");
		list.add("Ashaya");
		list.add("Aditi");
		list.add("Ameer");
		list.add("Arun");
		
//		Boolean isPresent = list.contains("Arya1"); // false

		Boolean isPresent = list.contains("Arya"); // true

		System.out.println("is Present in the list : "+isPresent);
	}
}
