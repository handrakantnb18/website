package com.day5.java;

// Combining Type Patterns with Sealed Classes

sealed class File permits TextFile, ImageFile, VideoFile {
}

final class TextFile extends File {
}

final class ImageFile extends File {
}

final class VideoFile extends File {
}

public class FileCategorization {

	public static void printFileType(File file, String extension) {
		switch (file) {
		case TextFile t -> System.out.println("Text File with extension: " + extension);
		case ImageFile i -> System.out.println("Image File with extension: " + extension);
		case VideoFile v -> System.out.println("Video File with extension: " + extension);
		default -> System.out.println("Unknown File with unknown extension");
		}
	}

	public static void main(String[] args) {

		File file1 = new TextFile();
		File file2 = new ImageFile();
		File file3 = new VideoFile();

		printFileType(file1, ".txt");
		printFileType(file2, ".jpg");
		printFileType(file3, ".mp4");

	}
}
