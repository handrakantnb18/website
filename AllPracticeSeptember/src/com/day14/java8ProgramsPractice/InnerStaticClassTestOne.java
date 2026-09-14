package com.day14.java8ProgramsPractice;

// An inner class can also be static, which means that you can
// access it without creating an object of the outer class:

class OuterClassS {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}

public class InnerStaticClassTestOne {

	public static void main(String[] args) {
		
		OuterClassS.InnerClass i = new OuterClassS.InnerClass();
	    System.out.println(i.y);
	    
	}
}
