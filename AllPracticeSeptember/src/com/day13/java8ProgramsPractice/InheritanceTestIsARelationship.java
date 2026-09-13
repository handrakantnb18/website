package com.day13.java8ProgramsPractice;

// SolarSystem is the superclass of Earth class.
// SolarSystem is the superclass of Mars class
// Earth and Mars are subclasses of SolarSystem class
// Moon is the subclass of both Earth and SolarSystem classes.

class SolarSystem {
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

public class InheritanceTestIsARelationship extends Earth {

	public static void main(String[] args) {

		SolarSystem s = new SolarSystem();
		Earth e = new Earth();
		Mars m = new Mars();

		System.out.println(s instanceof SolarSystem);
		System.out.println(e instanceof Earth);
		System.out.println(m instanceof SolarSystem);

	}
}
