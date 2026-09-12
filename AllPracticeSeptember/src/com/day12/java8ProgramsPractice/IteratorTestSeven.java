package com.day12.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// You can traverse an ArrayList using multiple methods like ListIterator, for loop, forEach(), and forEachRemaining().

public class IteratorTestSeven {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("1. Lemon");
		list.add("2. Water melan");
		list.add("3. Pinapple");
		list.add("4. Mango");
		list.add("5. Apple");
		list.add("6. Banana");
		list.add("7. Grapes");
		list.add("8. Orange");
		
		System.out.println("ListIterator (reverse):");  
        ListIterator<String> it = list.listIterator(list.size());  
        while (it.hasPrevious()) {  
            System.out.println(it.previous());  
        }  
  
        System.out.println("For loop:");  
        for (int i = 0; i < list.size(); i++) {  
            System.out.println(list.get(i));  
        }  
        
        System.out.println("forEach():");  
        list.forEach(a -> System.out.println(a));  
  
        System.out.println("forEachRemaining():");  
        Iterator<String> itr = list.iterator();  
        itr.forEachRemaining(a -> System.out.println(a));  
	
	}
}
