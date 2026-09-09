package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

public class ArraysListTestEight {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();  
		  
        list.add("1. Ravi");  
        list.add("2. Vijay");  
        list.add("3. Ajay"); 
        list.add("4. Ram");  
        list.add("5. Vaibhav");  
        list.add("6. Pooja");
  
        list.add(2, "7. Gaurav");  
  
        ArrayList<String> list2 = new ArrayList<>();  
        list2.add("8. Sonoo");  
        list2.add("9. Hanumat");  
  
        list.addAll(list2);  
  
        System.out.println(list);  
	}
}
