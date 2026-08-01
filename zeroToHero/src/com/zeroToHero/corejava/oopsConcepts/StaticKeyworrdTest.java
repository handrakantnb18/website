package com.zeroToHero.corejava.oopsConcepts;

class Employee{
	
	int empid;
	
	String name;
	
	static String companyname = "Veracity";
	
	Employee(int r, String n){
		empid = r;
		name = n;
	}
	
	void display() {
		System.out.println(empid+" "+name+" "+companyname);
	}
}

public class StaticKeyworrdTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Shivraj");
		
		Employee e2 = new Employee(11, "Dnyana");
		
		e1.display();
		
		e2.display();
	}
}
