package io.streams.classes.lowLevel;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Used to Read char/string directly from a File  
 */
public class FileReaders {

	public static void main(String[] args) throws IOException {
		File file = new File("doesnt_exist");
		FileReader bufferedReader = new FileReader(file);
		bufferedReader.read(); // Reads a single char, that's why BufferedReader is better
	}
	
}
