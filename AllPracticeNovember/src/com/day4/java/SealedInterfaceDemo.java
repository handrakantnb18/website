package com.day4.java;

// Sealed Interfaces

sealed interface Vehicle permits Car, Bike, Truck {
}

final class Car implements Vehicle {
}

final class Bike implements Vehicle {
}

final class Truck implements Vehicle {
}

public class SealedInterfaceDemo {

	public static int countWheels(Vehicle vehicle) {
		return switch (vehicle) {
		case Car c -> 4;
		case Bike b -> 2;
		case Truck t -> 6;
		};
	}

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle truck = new Truck();

		System.out.println("Car has " + countWheels(car) + " wheels.");
		System.out.println("Bike has " + countWheels(bike) + " wheels.");
		System.out.println("Truck has " + countWheels(truck) + " wheels.");

	}
}
