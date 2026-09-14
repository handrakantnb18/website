package com.day14.java8ProgramsPractice;

// create an object of the outer class, and then create an object of the inner class:

class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 5;
	}
}

public class InnerClassTestOne {

	public static void main(String[] args) {

		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);

	}
}
