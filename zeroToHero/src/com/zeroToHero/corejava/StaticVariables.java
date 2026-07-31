package com.zeroToHero.corejava;

class Student {
	static int age;
}

public class StaticVariables {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 25;
		s2.age = 30;
		
		Student.age = 26;
		
		System.out.println("S1 age is : "+s1.age);
		
		System.out.println("S2 age is : "+s2.age);
		
	}
}
