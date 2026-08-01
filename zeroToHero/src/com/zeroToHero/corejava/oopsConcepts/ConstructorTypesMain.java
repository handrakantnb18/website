package com.zeroToHero.corejava.oopsConcepts;

public class ConstructorTypesMain {

	// class name and constructor name same
	// no need to write return type before use (void)
	// we don't write abstract, static, final keyword in constructor
	// two types of constructor
	// no-parameterized constructor => we don't use parameter and arguments
	// parameterized constructor ==> we can use parameter and arguments in constructor
	
	ConstructorTypesMain(){
		System.out.println("Default Constructor or no-parameterized constructor");
		System.out.println("Simple Constructor created.");
	}
	
	ConstructorTypesMain(int id, String name){
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypesMain con = new ConstructorTypesMain(111, "chandrakant");
		
		ConstructorTypesMain con1 = new ConstructorTypesMain(112, "priyanka");
		
		// con.id(101);
	}
}
