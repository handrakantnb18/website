package com.day10.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.day1.java8ProgramsPractice.Student;

public class SortIdUser {

	public static void main(String[] args) {
		
		// Convert List into Map
				List<User> list = Arrays.asList(
						new User(1, "Rahul", "Pune", "9876543210"),
						new User(2, "OM", "mumbai", "987652523210"),
						new User(3, "Omkar", "Pune", "9876883210"),
						new User(4, "Ram", "mumbai", "94568583210")
						);
				
				Map<Integer, User> map =
				list.stream()
				.collect(Collectors.toMap(User::getId, s->s));
				
				System.out.println(map);
			
	}
}
