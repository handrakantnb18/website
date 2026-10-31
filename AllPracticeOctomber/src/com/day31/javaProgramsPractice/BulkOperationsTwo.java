package com.day31.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

// Bulk Operations (Merging and Filtering Collections)

public class BulkOperationsTwo {

	public static void main(String[] args) {

		Collection<String> coreCourses = new ArrayList<>();

		coreCourses.add("Java");
		coreCourses.add("Python");

		Collection<String> electiveCourses = new ArrayList<>();
		electiveCourses.add("Data Science");
		electiveCourses.add("Cloud Computing");

		Collection<String> allCourses = new HashSet<>(coreCourses); // Initialized with core
		allCourses.addAll(electiveCourses);
		System.out.println("All Offered Courses: " + allCourses);

		System.out.println("Are core courses offered? " + allCourses.containsAll(coreCourses));

		allCourses.removeAll(electiveCourses);
		System.out.println("Courses left after removing electives: " + allCourses);

	}
}
