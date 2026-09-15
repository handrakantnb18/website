package com.day15.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// demonstrates different ways to iterate through an ArrayList.

public class ArrayListTestFive {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();  
		  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
  
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
