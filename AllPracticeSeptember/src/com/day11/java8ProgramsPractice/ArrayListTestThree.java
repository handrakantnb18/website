package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// create a list of integers lastIndexOf() to find the last occurrence of an elements in the list

public class ArrayListTestThree {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int i = list.indexOf(2);
		
		System.out.println("First Occurence of 2 index : "+i);
		
		int l = list.lastIndexOf(2);
		
		System.out.println();
		
		System.out.println("Last Occurence of 2 index : "+l);

	}
}
