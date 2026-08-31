package com.day24.java8ProgramsPractice;

// we are referring non-static methods. You can refer methods by class 
// object and anonymous object.

interface Sayable5{  
    void say();  
}  

public class InstanceMethodReference {

	public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	
	public static void main(String[] args) {

		InstanceMethodReference methodReference = new InstanceMethodReference();
		
		Sayable5 sayable = methodReference::saySomething;
		
		sayable.say();
		
		Sayable5 sayable2 = new InstanceMethodReference()::saySomething;
		
		sayable2.say();
	}
}
