package com.day13.java8ProgramsPractice;

// Multilevel Inheritance
// a derived class will be inheriting a base class and as well as
// the derived class also acts as the base class for other classes
class VehicleMul {
	VehicleMul() {
		System.out.println("This is vehical.");
	}
}

class FourWheeler extends VehicleMul {
	FourWheeler() {
		System.out.println("4 wheeler Vehicle.");
	}
}

class CarMul extends FourWheeler {
	CarMul() {
		System.out.println("This 4 wheeler VEhicle is a Car.");
	}
}

public class InheritanceTestMultilevel {

	public static void main(String[] args) {
		
		CarMul obj = new CarMul();
		
	}
}
