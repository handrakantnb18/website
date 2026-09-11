package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

//Adding elements to object of List class

public class ArrayListTestTwo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Ram");
		list.add(1, "Ram");

        System.out.println("Initial ArrayList " + list);
        
        list.set(1, "Raj");

        System.out.println("Updated ArrayList " + list);
		
	}
}
