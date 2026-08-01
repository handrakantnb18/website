package com.zeroToHero.corejava.oopsConcepts;

// demonstrates abstraction using an abstract class with both abstract and concrete methods.
//
//abstract class Animal {  
//    abstract void makeSound();  
//    
//    void breathe() {  
//        System.out.println("Animal is breathing...");  
//    }  
//}  
//
//class Dog extends Animal {  
//     
//    @Override  
//    void makeSound() {  
//        System.out.println("Dog barking");  
//    }  
//}  

public class MainAbstract {

	public static void main(String[] args) {
		
		Animal myDog = new Dog();  
//        myDog.breathe();  
//        
//        myDog.makeSound();  
		
	}
}
