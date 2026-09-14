package com.day14.java8ProgramsPractice;

// To implement multiple interfaces, separate them with a comma:

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class InterfacesMultipleTestOne {

	public static void main(String[] args) {

		DemoClass d = new DemoClass();
		d.myMethod();
		d.myOtherMethod();
	}
}
