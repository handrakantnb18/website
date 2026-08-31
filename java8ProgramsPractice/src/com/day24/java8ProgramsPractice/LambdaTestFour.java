package com.day24.java8ProgramsPractice;

// use a lambda expression with multiple parameters to perform a calculation.

@FunctionalInterface
interface ThreeParametersFunctionalInterface {
	double calculationAverage(double a, double b, double c);
}

public class LambdaTestFour {

	public static void main(String[] args) {
		
		ThreeParametersFunctionalInterface myLambda = (a, b, c) -> {
			return (a + b + c) / 3.0;
		};
		
		double average = myLambda.calculationAverage(10.0,  20.0, 30.0);
		System.out.println("Average: "+average);
		
	}
}
