package com.day19.java8ProgramsPractice;

import java.util.Stack;

// The stack approach uses the Last-In-First-Out 
// (LIFO) principle to reverse characters

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
