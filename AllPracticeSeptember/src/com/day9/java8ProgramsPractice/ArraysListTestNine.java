package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

public class ArraysListTestNine {

	public static void main(String[] args) {
		
		 ArrayList<String> list = new ArrayList<>();  
		  
	        list.add("1. Ravi");  
	        list.add("2. Vijay");  
	        list.add("3. Ajay"); 
	        list.add("4. Ram");  
	        list.add("5. Vaibhav");  
	        list.add("6. Pooja");
	  
	        list.remove("2. Vijay");  
	        list.remove(0);  
	  
	        System.out.println(list);  
	        
	}
}
