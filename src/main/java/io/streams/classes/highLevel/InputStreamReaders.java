package io.streams.classes.highLevel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Read bytes and decode them into string using a determined charset.
 * 
 * ps.: Not covered in the exam.
 */
public class InputStreamReaders {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream outputStream = new BufferedInputStream(new FileInputStream("C:\\temp\\algumArquivo.txt"));
		
		InputStreamReader inputStreamReader = new InputStreamReader(outputStream);
		
	}
	
}
