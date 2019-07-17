package io.streams.classes.lowLevel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Used to Write char/string directly from a File 
 */
public class FileWriters {

	public static void main(String[] args) throws IOException {
		File file = new File("doesnt_exist");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("aaa".toCharArray());
		fileWriter.write("aaa");
	}
	
}
