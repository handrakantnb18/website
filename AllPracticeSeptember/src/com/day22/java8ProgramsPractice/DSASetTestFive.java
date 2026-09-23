package com.day22.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// A Set in Java is a collection that does not allow duplicate elements

public class DSASetTestFive {

	public static void main(String[] args) {
		
		 Set<Object> set = new HashSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(20);
	        set.add("chandraaknt");
	        set.add(true);

	        System.out.println(set);
	}
}
