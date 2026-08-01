package com.zeroToHero.corejava.oopsConcepts;

public class PredefinedMethod {

	public static void main(String[] args) {
		
		// Math.pow() method Calculations
		System.out.println("2 raised to the power of 5 is :"
				+ Math.pow(2, 5));
		
		System.out.println("--------------------------");
		// String.length() method check 
		String str = "chandrakant bhosale";
		
		System.out.println("String lenth : "+str.length());
		
		System.out.println("--------------------------");
		
		// String.equals() method
		
		String str1 = "chandrakant bhosale";
		String str2 = new String("chandrakant");
		
		System.out.println("Check equals parameters str1 : "+(str1.equals(str)));
		System.out.println("Check equals parameters str2 : "+(str1.equals(str2)));
		
		System.out.println("---------------------------");
		
		
		
	}
}
