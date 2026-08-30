package com.day30.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

// lists, one can use collections.reverse() method
//Reversing the ArrayList using reverse() method 
//appending characters to the string res from the list
public class ReverseStringCollectionSix {

	public static void main(String[] args) {
		
		String str = "my name is chandrakant bhosale";
		
		char[] ch = str.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for(char c : ch)
			list.add(c);
		
		Collections.reverse(list);
		
		ListIterator itr = list.listIterator();
		
		String res = "";
		
		while(itr.hasNext())
		{
			res =res + itr.next();
		}
		
		System.out.println("Original String : "+str);
		
		System.out.println("Reverse String : "+res);
	}
}
