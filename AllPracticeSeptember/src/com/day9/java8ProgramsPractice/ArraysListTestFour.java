package com.day9.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysListTestFour {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();  
        list1.add("1. Mango");  
        list1.add("2. Apple");  
        list1.add("3. Banana");  
        list1.add("4. Grapes");  
        list1.add("5. Orange");
		list1.add("6. Khajur");
		
		System.out.println("Fouts check : ");
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
