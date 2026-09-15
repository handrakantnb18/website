package com.day15.java8ProgramsPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// how to serialize and deserialize an ArrayList.

public class ArrayListTestSeven {

	public static void main(String[] args) {

		try {
			ArrayList<String> list = new ArrayList<>();
			list.add("Ravi");
			list.add("Vijay");
			list.add("Ajay");

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
