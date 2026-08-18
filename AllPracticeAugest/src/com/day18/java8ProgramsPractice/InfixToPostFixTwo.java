package com.day18.java8ProgramsPractice;

import java.util.Stack;

public class InfixToPostFixTwo {
 
	static int precedence(char ch) {
		switch(ch) {
		case'+':
		case '-':
			return 1;
			
		case '*':
		case '/':
		case '%':
			return 2;
			
		case '^':
			return 3;
		}
		
		return -1;
		
	}
	
	static String infixToPostfix(String expression) {
		
		StringBuilder result = new StringBuilder();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : expression.toCharArray()) {
			
			if(Character.isLetterOrDigit(ch)) {
				result.append(ch);
			}
			
			else if(ch == '(') {
				stack.push(ch);
			}
			
			else if(ch == ')') {
				
				while (!stack.isEmpty() && stack.peek() != '(') {
					
					result.append(stack.pop());
				}
				
				stack.pop();
			}
			else {
				
				while(!stack.isEmpty() && 
						precedence(ch) <= precedence(stack.peek())) {
					
					result.append(stack.pop());
				}
				
				stack.push(ch);
			}
		}
		
		while (!stack.isEmpty()) {
			
			result.append(stack.pop());
		}
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		
		String expression = "A+B*C";
		
		String postfix = infixToPostfix(expression);
		
		System.out.println("Infix : "+expression);
		System.out.println("Postfix : "+postfix);
		
		}
}
