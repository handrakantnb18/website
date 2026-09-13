package com.day13.java8ProgramsPractice;

// Hierarchical Inheritance
//  more than one subclass is inherited from a single base class.
// more than one derived class is created from a single base class. 

class VehicleHir {
	VehicleHir() {
		System.out.println("This is Vehicle.");
	}
}

class CarHir extends VehicleHir {
	CarHir() {
		System.out.println("This vehicle is car");
	}
}

class Bus extends VehicleMul {
	Bus() {
		System.out.println("This is vehicle is Bus");
	}
}

public class InheritanceTestHirarchicle {

	public static void main(String[] args) {
		
		CarHir c = new CarHir();
		Bus b = new Bus();
		
	}
}
