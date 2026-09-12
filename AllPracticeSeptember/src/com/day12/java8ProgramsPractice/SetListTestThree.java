package com.day12.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// if we wish to access the elements, we can use inbuilt methods like contains().

public class SetListTestThree {

	public static void main(String[] args) {
		
		Set<Integer> list = new HashSet<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(5);
		
		System.out.println("Set is :"+list);
		
//		Integer num = 1; // true
		
		Integer num = 10; // false
		
		System.out.println("Contain : "+num + " "+list.contains(num));
		
	}
}
