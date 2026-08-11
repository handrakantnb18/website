package com.day10.java8ProgramsPractice;

class Person{
	int id;
	String name;
	
	Person(int id, String name){
		
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;
	Emp(int id, String name, float salary){
		super(id, name);
		this.salary = salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class MainSuper {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Ankit", 450000f);
		Emp e2 = new Emp(2, "Ram", 360000f);
		e1.display();
		e2.display();
		
	}
}
