package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Creates an ArrayList named fruits Adds multiple fruit names to the list
// Collections.sort(fruits) sorts elements in ascending (natural) order

public class SortingElementsTestFive {

	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Graphs");
		fruit.add("Orange");
		fruit.add("Annar");
		fruit.add("Mango");
		
		System.out.println("Befor sortinh elements : "+fruit);
		
		Collections.sort(fruit);
		
		System.out.println("After sort elements : "+fruit);
		
	}
}
