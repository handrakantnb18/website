package com.day3.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// How to get Slice of a Stream in Java

public class SliceStream {

	public static <T> Stream<T>

			getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
		return stream.skip(startIndex).limit(endIndex - startIndex + 1);
	}

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		for (int i = 10; i <= 19; i++)
			list.add(i);

		Stream<Integer> intStream = list.stream();

		System.out.println("List: " + list);

		Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 3, 7);

		System.out.println("\nSlice of Stream:");
		sliceOfIntStream.forEach(System.out::println);

	}

}