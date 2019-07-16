package io.streams.classes.lowLevel;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Used to Write bytes directly to a File 
 */
public class FileOutputStreams {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileInputStream = new FileOutputStream("C:\\temp\\algumArquivo.txt");
		fileInputStream.write(1);
		fileInputStream.write(new byte[] {1});
		fileInputStream.write(new byte[] {1}, 10, 50);
		// 10 -> Number of bytes to skip before start writing
		// 50 -> The length of what will be written
	}
	
}
