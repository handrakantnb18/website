package com.day13.java8ProgramsPractice;

// Hybrid Inheritance
// It is a mix of two or more of the above types of inheritance
// we can achieve hybrid inheritance only through Interfaces if we want to
// involve multiple inheritance to implement Hybrid inheritance.

class VehicleHy {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}
class CarHy extends VehicleHy {
    void carType() {
        System.out.println("This is a Car");
    }
}

class BusHy extends VehicleHy implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}


public class InheritanceTestHybrid {

	public static void main(String[] args) {
		
		CarHy c = new CarHy();
		c.vehicleType();
		c.carType();
		
		BusHy b = new BusHy();
		b.vehicleType();
		b.busType();
		b.fareInfo();
		
	}
}
