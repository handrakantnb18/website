package com.zeroToHero.exception;
// Java inner classes are classes defined within another class
// that are used to improve encapsulation and code organization
// we have an outer class Student with an inner class Address.

class Student{
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	class Address{
		String city, state;
		
		Address(String city, String state){
			this.city = city;
			this.state = state;
		}
		
		void display() {
			System.out.println("Student name : "+name);
			System.out.println("City : "+city);
			System.out.println("State : "+city);
		}
	}
}

public class InnerClassNestedTest {

	public static void main(String[] args) {
		
		Student st = new Student("Shivraj");
		
		Student.Address addr = st.new Address("Pune", "Maharashtra");
		addr.display();
		
	}
}
