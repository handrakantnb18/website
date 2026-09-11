package com.day11.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// This method returns the element at the specified index in the list.

public class ArrayListTestFive {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Pooja");
        list.add("2. Prakash");
        list.add("3. Pranita");
        list.add("4. Pruthvi");
        list.add("5. Prachi");
        list.add("6. Pramod");
        list.add("7. Pravin");
        list.add("8. Payal");
        list.add("9. Pranam");
        
        String first = list.get(0);
        String second = list.get(1);
        String third = list.get(2);
        String four = list.get(3);
        String five = list.get(4);
        String six = list.get(5);
        String seven = list.get(6);
        String eight = list.get(7);
        String nine = list.get(8);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        
        System.out.println("Total : "+list);
	}
}
