package com.day11.java8ProgramsPractice;

// take another example to demonstrate the shape class using runtime poly

class Shape {
	void draw() {
		System.out.println("Drawing.....");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle....");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing Circle....");
	}
}

class Tringle extends Shape {
	void draw() {
		System.out.println("drawing Triangle...");
	}
}

public class RuntimePolymorphismShape {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Tringle();
		s.draw();
	}
}
