package com.day24.java8ProgramsPractice;
// class has multiple methods with the same name but
// different parameter lists, it is called method overloading.

public class Calculater {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b +c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Calculater cl = new Calculater();
		
		System.out.println(cl.add(150, 200));
		System.out.println(cl.add(100, 250, 360));
		System.out.println(cl.add(25.25, 50.30));
		
	}
}
