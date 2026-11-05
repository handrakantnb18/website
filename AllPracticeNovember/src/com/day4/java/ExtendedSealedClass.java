package com.day4.java;

// Extending Sealed Classes

sealed class Shape permits Circle, Rectangle, Triangle, Polygon {
}

final class Circle extends Shape {
}

final class Rectangle extends Shape {
}

final class Triangle extends Shape {
}

final class Polygon extends Shape {
}

public class ExtendedSealedClass {

	private static void extractedShape(Shape shape) {

		switch (shape) {
		case Circle c -> System.out.println("Circle");
		case Rectangle r -> System.out.println("Rectangle");
		case Triangle t -> System.out.println("Triangle");
		case Polygon p -> System.out.println("Polygon");
		default -> System.out.println("Unknown Shape");
		}
	}

	public static void main(String[] args) {

		Shape polygon = new Polygon();
		extractedShape(polygon);

	}
}
