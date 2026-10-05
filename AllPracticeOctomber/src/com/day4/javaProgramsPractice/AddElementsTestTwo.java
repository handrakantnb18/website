package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// add elements using the add(E e) method for a single element or addAll(Collection c) to add multiple elements

public class AddElementsTestTwo {

	public static void main(String[] args) {
		
		Collection<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		num1.add(6);
		
		System.out.println("Before adding elements : "+num1);
		
		Collection<Integer> num2 = new ArrayList<Integer>();
		num2.add(7);
		num2.add(8);
		num2.add(9);
		
		num1.addAll(num2);
		
		System.out.println("After adding elements : "+num1);
		
	}
}
