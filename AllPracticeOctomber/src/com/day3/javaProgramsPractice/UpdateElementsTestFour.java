package com.day3.javaProgramsPractice;

import java.util.ArrayList;

//Creates an ArrayList to store String elements.
// Adds elements using add() method set(0, "Orange") replaces the element at index 0

public class UpdateElementsTestFour {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Graphs");
		fruits.add("Orange");
		fruits.add("Annar");
		fruits.add("Mango");
		
		System.out.println("Befor update elements : "+fruits);
		
		fruits.set(0, "Potato");
		
		System.out.println("After update elements : "+fruits);
		
	}
}
