package com.day9.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

// String Manipulation & Unicode Edge Cases

public class DocumentCleaner {

	public List<String> cleanFileLines(Path filePath) 
			throws IOException {

		String content = Files.readString(filePath); 

        return content.lines() 
                .map(String::strip) 
                .filter(line -> !line.isBlank()) 
                .collect(Collectors.toList());
        
    }
}
