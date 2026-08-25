package com.day1.java17features;

sealed interface Shape permits Circle, Rectangle {}

final class Circle implements Shape {
	final double r;
	Circle(double r){
		this.r = r;
	}
}

final class Rectangle implements Shape {
	final double w, h;
	
	Rectangle(double w, double h){
		this.w = w;
		this.h = h;
	}
}

public class MainSealed {

	public static double area(Shape s) {
		if(s instanceof Circle c)
			return Math.PI * c.r * c.r;
		
		else if (s instanceof Rectangle r)
			return r.w * r.h;
		throw new IllegalArgumentException("Unknown shape.");
	}
	public static void main(String[] args) {
		
		System.out.println(area(new Circle(2)));
		System.out.println(area(new Rectangle(6,6)));
		
	}
}
