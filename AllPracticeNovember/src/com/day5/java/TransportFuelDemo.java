package com.day5.java;

// Combining Sealed Classes and Enum Switch

sealed class Transport permits Car, Bike, Train {
}

final class Car extends Transport {
}

final class Bike extends Transport {
}

final class Train extends Transport {
}

enum FuelType {
	PETROL, DIESEL, ELECTRIC, UNKNOWN;
}

public class TransportFuelDemo {

	public static FuelType getFuelType(Transport transport) {
	      return switch (transport) {
	          case Car c -> FuelType.DIESEL;
	          case Bike b -> FuelType.PETROL;
	          case Train t -> FuelType.ELECTRIC;
	          default -> FuelType.UNKNOWN;

	      };
	   }
	
	public static void main(String[] args) {

		Transport car = new Car();
		Transport train = new Train();
		System.out.println("Car fuel: " + getFuelType(car));
		System.out.println("Train fuel: " + getFuelType(train));

	}
}
