package com.day12.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// how to sort elements of an ArrayList using the Collections.sort() method.

public class IteratorTestSix {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("1. Lemon");
		list1.add("2. Water melan");
		list1.add("3. Pinapple");
		list1.add("4. Mango");
		list1.add("5. Apple");
		list1.add("6. Banana");
		list1.add("7. Grapes");
		list1.add("8. Orange");

		Collections.sort(list1);  
		  
        for (String fruit : list1) {  
            System.out.println(fruit);  
        }  
        
        System.out.println("Sorting numbers...");  
        
        List<Integer> list2 = new ArrayList<>();  
        list2.add(21);  
        list2.add(11);  
        list2.add(51);  
        list2.add(1);  
        
        Collections.sort(list2);  
        
        for (Integer number : list2) {  
            System.out.println(number);  
        }  
		
	}
}
