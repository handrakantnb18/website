package com.day18.java8ProgramsPractice;

import java.util.ArrayList;

public class AllNumAndOddNumbers {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		
		System.out.println("All Numbers : ");
		list.forEach(n -> System.out.println(n));
		 
		System.out.println("Odd Numbers : ");
		list.forEach(n -> {
			if(n % 2 != 0)
				System.out.println(n);
			
		});
	}
}
