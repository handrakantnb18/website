package com.day20.java8ProgramsPractice;

//The stack approach uses the Last-In-First-Out 
//(LIFO) principle to reverse characters

import java.util.Stack;

public class ReverseStringTestSix {

	public static void main(String[] args) {

		String str = "chandrakant bhosale";

		Stack<Character> st = new Stack<Character>();

		for (char c : str.toCharArray()) {

			st.push(c);
		}

		String res = "";

		while (!st.isEmpty()) {

			res += st.pop();
		}

		System.out.println(res);

	}

}
