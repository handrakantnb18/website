package com.zeroToHero.corejava.oopsConcepts;

//Creating a Student class
class Student1{
	
	 //declaring fields or instance variables  

	int mobileNo = 987456123;
	
	String email = "chandrakant@gmail.com";
	
}

public class MainVariables {

	// instance variable
	int id = 101;
	
	String name = "chandrakant ";
	
	public static void main(String[] args) {
		
		MainVariables s1 = new MainVariables();
		
		System.out.println(s1.id); // reference variable
		
		System.out.println(s1.name); // reference variable
		
		//Creating another class which contains the main() method    

		Student1 st = new Student1();
		
		System.out.println(st.email);
		
		System.out.println(st.mobileNo);
		
	}
}
