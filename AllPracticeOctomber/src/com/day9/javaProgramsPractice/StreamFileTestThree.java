package com.day9.javaProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// filtering, sorting, mapping and collecting transactions using Java Streams

public class StreamFileTestThree {

	private int id;
	private int value;
	private String type;

	public StreamFileTestThree(int id, int value, String type) {
		this.id = id;
		this.value = value;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public String getType() {
		return type;
	}

	public static void main(String[] args) {

		List<StreamFileTestThree> transactions = 
				Arrays.asList(new StreamFileTestThree(1, 100, "GROCERY"),
				new StreamFileTestThree(3, 80, "GROCERY"), 
				new StreamFileTestThree(6, 120, "GROCERY"),
				new StreamFileTestThree(7, 40, "ELECTRONICS"),
				new StreamFileTestThree(10, 50, "GROCERY"));

		List<Integer> transactionIds = 
				transactions.stream().filter(t -> t.getType()
						.equals("GROCERY"))
				.sorted(Comparator.comparing(
						StreamFileTestThree::getValue).reversed())
				.map(StreamFileTestThree::getId)
				.collect(Collectors.toList());

		System.out.println(transactionIds);

	}
}
