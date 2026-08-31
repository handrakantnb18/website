package com.day31.java8ProgramsPractice;

// shows an interface with a single method. The
// implementation of the interface is provided by a class.
interface Printable {
	void print();
}

class Printer implements Printable {
	public void print() {
		System.out.println("Hello");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Printable p = new Printer();
		p.print();
		
	}
}
