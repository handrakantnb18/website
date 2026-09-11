package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Creating List class object Adding and removing elements

public class ArrayListTestFour {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ram");
        list.add("Raj");
        list.add("Rohan");
        list.add("Rutuja");
        list.add("Rohan");
        list.add("Ragini");
        
        list.add(1, "Ravi");
        
        System.out.println("Initial ArrayLis : "+list);
     
        list.remove(1);
        
        System.out.println("After the index removel : "+list);
        
        list.remove("Rutuja");
        
        System.out.println("After the object removel : "+list);
        
	}
}
