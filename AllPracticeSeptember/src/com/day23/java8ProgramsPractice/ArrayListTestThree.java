package com.day23.java8ProgramsPractice;

// elements of an ArrayList with a for loop, and use the size() method

import java.util.ArrayList;

public class ArrayListTestThree {

	public static void main(String[] args) {
		
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		    
	}
}
