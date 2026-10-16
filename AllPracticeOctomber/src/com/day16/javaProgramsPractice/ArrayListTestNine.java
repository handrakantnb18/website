package com.day16.javaProgramsPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// how to serialize and deserialize an ArrayList.
// Serialization converts an object into a byte stream, while deserialization restores it back

public class ArrayListTestNine {

	public static void main(String[] args) {

		try {
			ArrayList<String> list = new ArrayList<>();
			list.add("Ravi");
			list.add("Vijay");
			list.add("Ajay");
			list.add("Ram");
			list.add("Amit");
			list.add("Pooja");
			list.add("Priya");
			list.add("Neha");
			list.add("Neeta");

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"));
			oos.writeObject(list);
			oos.close();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file"));
			ArrayList data = (ArrayList) ois.readObject();

			System.out.println(data);
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
