package com.day27.javaProgramsPractice;

import java.util.*;

// How to iterate a Map containing a List of String in Java 8

public class IterateMapOfListTestFive {

	public static void main(String[] args) {

		Map<String, List<String>> listOfAnimals = new HashMap<String, List<String>>();

		List<String> listOfMammals = Arrays.asList("Cat", "Dog", "Monkey", "Cow");

		listOfAnimals.put("Mammals", listOfMammals);

		List<String> listOfBirds = Arrays.asList("Crow", "Parrot", "Peacock", "Flamingo");

		listOfAnimals.put("Birds", listOfBirds);

		List<String> listOfReptiles = Arrays.asList("Lizard", "Turtle", "Crocodile", "Python");

		listOfAnimals.put("Reptiles", listOfReptiles);

		listOfAnimals.forEach((key, value) -> System.out
				.println("Category name : " 
		+ key + "\t\t" + "List of Animals under the Category : " + value));

	}
}
