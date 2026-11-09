package com.day7.java;

import java.io.*;

// Write a Java program to serialize and deserialize a Java object

class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class SerializeDeserialize {

	public static void main(String[] args) {

		Person person = new Person("chandrakant", 32);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
			Person deserializedPerson = (Person) ois.readObject();
			System.out.println("Deserialized Person: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
