package com.day2.java17features;

// Sealed classes allow you to restrict which classes can extend or implement a class/interface.

public sealed class SealedTest permits Car, Bike {

}

final class Car extends SealedTest {
	
}

final class Bike extends SealedTest {
	
}
