package com.day18.java8ProgramsPractice;

interface ZParameter{
	
	void display();
}

public class ZeroParameter {

	public static void main(String[] args) {
		
		ZParameter zParameter = 
				() -> System.out.println(
						"Zero parameter in lambda parameter");
				
				zParameter.display();
	}
}
