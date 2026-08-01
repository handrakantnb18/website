package com.zeroToHero.corejava.oopsConcepts;

// here the Car class extends the Vehicle class and accesses both inherited methods and its own method.
class Vehical {
	void start() {
		System.out.println("Vehical is starting....");
	}
	
	void stop() {
		System.out.println("Vehical is stopping...");
	}
}

class Car extends Vehical{
	void honk() {
		System.out.println("Car is honking....");
	}
}

public class MainVehical {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.start();
		myCar.stop();
		
		myCar.honk();
		
	}
}
