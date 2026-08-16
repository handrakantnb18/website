package com.zeroToHero.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SortSerilizationArrayList {

	// ArrayList Serialization and Deserialization
	// demonstrates how to serialize and deserialize an ArrayList.
	
	public static void main(String[] args) {

		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("Ram");
			list.add("Amit");
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
