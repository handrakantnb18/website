package com.day10.java8ProgramsPractice;

// The instance initializer block is executed whenever an object of the class is created.
// The instance initializer block is invoked after the parent class constructor (super()) is called.

class A {
	A(){
		System.out.println("Parent class constructor invoked");
	}
}

public class InitializerBlockSuper extends A {

	InitializerBlockSuper() {
		super();
		System.out.println("Child class constructor invoked");
	}
	{
		System.out.println("instance intializer block is invoked");
	}
	
	public static void main(String[] args) {
		InitializerBlockSuper ib = new InitializerBlockSuper();
		
	}
}
