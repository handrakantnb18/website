package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

//The List interface in Java extends the Collection interface

public class ArrayListTestOne {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
        list.add("2. Python");
        list.add("3. DSA");
        list.add("4. C++");
        
        for (String str : list)
        	System.out.println(str);
        
	}
}
