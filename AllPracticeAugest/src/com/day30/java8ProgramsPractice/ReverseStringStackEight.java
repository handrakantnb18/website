package com.day30.java8ProgramsPractice;

import java.util.Stack;

// Stack works on the principle of LIFO (Last In First Out),
// Push the elements/characters of the string 
// Pop the elements/characters individually from the Stack
// Add a popped , Convert character array to string.
// Return turned around the string.

public class ReverseStringStackEight {

	public static void main(String[] args) {
		
		String oriStr = "SHIVRAJ BHOSALE";
		int size = oriStr.length();
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < size; i++) {
			st.push(oriStr.charAt(i));
		}
		
		String resStr = "";
		
		while(!st.isEmpty()) {
			// popping all the characters from the stack
			//  and appending it to the result, string temp  
			resStr = resStr + st.pop();
		}
		
		System.out.println("Original String : "+oriStr);
		
		System.out.println("Reverse String : "+resStr);
	}
}
