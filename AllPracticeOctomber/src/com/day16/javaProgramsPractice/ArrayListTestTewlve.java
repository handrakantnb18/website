package com.day16.javaProgramsPractice;

import java.util.ArrayList;

// The retainAll() method keeps only common elements between two collections

public class ArrayListTestTewlve {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();  
        list1.add("Ravi");  
        list1.add("Vijay");  
        list1.add("Priya");
		list1.add("Neha");
		list1.add("Neeta");

        ArrayList<String> list2 = new ArrayList<>();  
        list2.add("Ravi");  
  
        list1.retainAll(list2);  
  
        System.out.println(list1);  
        
	}
}
