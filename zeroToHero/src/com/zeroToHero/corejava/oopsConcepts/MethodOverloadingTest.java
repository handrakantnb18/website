package com.zeroToHero.corejava.oopsConcepts;

class StudentTest{
	int id;
	String name;
	int age;
	
	StudentTest(int i, String s){
		id= i;
		name= s;
	}
	
	StudentTest(int i, String s, int a){
		id = i;
		name = s;
		age = a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
}

public class MethodOverloadingTest {

	public static void main(String[] args) {
		
		StudentTest s1 = new StudentTest(1, "chandrakant");
		
		StudentTest s2 = new StudentTest(2, "Priyanka", 27);
		
		s1.display();
		s2.display();
		
	}
}
