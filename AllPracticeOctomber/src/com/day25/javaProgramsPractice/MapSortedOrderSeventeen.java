package com.day25.javaProgramsPractice;

import java.util.*;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

// 17. How to convert a List of objects into a Map by 
// considering duplicated keys and store them in sorted order?

class NotesTwo {

	private Integer id;
	private String tagName;
	private Long tagId;

	public NotesTwo(Integer id, String tagName, 
			long tagId) {
		
		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public Integer getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Long getTagId() {
		return tagId;
	}
}

public class MapSortedOrderSeventeen {

	public static void main(String[] args) {

		List<NotesTwo> noteLst = new ArrayList<>();

		noteLst.add(new NotesTwo(1, "note1", 11));
		noteLst.add(new NotesTwo(2, "note2", 22));
		noteLst.add(new NotesTwo(3, "note3", 33));
		noteLst.add(new NotesTwo(4, "note4", 44));
		noteLst.add(new NotesTwo(5, "note5", 55));
		noteLst.add(new NotesTwo(6, "note4", 66));

		Map<String, Long> notesRecords = noteLst.stream()
				.sorted(Comparator.comparingLong
						(NotesTwo::getTagId).reversed())
				.collect(Collectors.toMap
						(NotesTwo::getTagName, 
								NotesTwo::getTagId, 
								(oldValue, newValue) -> 
						oldValue,
						LinkedHashMap::new));

		System.out.println("Notes : " + notesRecords);
	}
}
