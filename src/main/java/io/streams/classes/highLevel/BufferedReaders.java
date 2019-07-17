package io.streams.classes.highLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaders {

	public static void main(String[] args) throws IOException {
		File file = new File("doesnt_exist");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String readLine = bufferedReader.readLine();
	}
	
}
