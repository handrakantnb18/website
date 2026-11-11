package com.day8.java;

import java.util.Stack;

// Write a Java program to convert infix expressions to postfix expressions

public class InfixToPostfix {

	public static String infixToPostfix(String exp) {
		
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for (char c : exp.toCharArray()) {
			if (Character.isLetterOrDigit(c))
				result.append(c);
			else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				
				while (!stack.isEmpty() && stack.peek() != '(')
					result.append(stack.pop());
				stack.pop();
			} 
			else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
					result.append(stack.pop());
				stack.push(c);
			}
		}
		while (!stack.isEmpty())
			result.append(stack.pop());
		return result.toString();
	}

	public static int precedence(char ch) {
		
		return switch (ch) {
		case '+', '-' -> 1;
		case '*', '/' -> 2;
		case '^' -> 3;
		default -> -1;
		};
	}

	public static void main(String[] args) {
		
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		
		System.out.println("Postfix expression: " + infixToPostfix(exp));
	}

}
