package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

//Creating a List of Strings using ArrayList

public class ArrayListTestOne {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ram");
        list.add("Rahul");
        list.add("Pooja");
        list.add("Rani");
        list.add("Amit");
        list.add("Ajit");
        
        System.out.println("Element List : ");
        
        for (String i : list)
        	System.out.println(i);
        
	}
}
