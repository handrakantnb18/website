package com.day14.java8ProgramsPractice;

// You can also use an anonymous class to implement an interface on the fly:

interface Greeting {
	void sayHello();
}

public class AnonymousClassInterfaceTestOne {

	public static void main(String[] args) {

		Greeting g = new Greeting() {
			public void sayHello() {
				System.out.println("Hello, World! iwujhdfibf ");
			}
		};

		g.sayHello();
	}
}
