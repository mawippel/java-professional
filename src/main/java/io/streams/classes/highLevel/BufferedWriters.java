package io.streams.classes.highLevel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriters {

	public static void main(String[] args) throws IOException {
		File file = new File("doesnt_exist");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		bufferedWriter.write("aaa".toCharArray());
		bufferedWriter.write("aaa");
		bufferedWriter.newLine();
	}
	
}
