package io.streams.classes.lowLevel;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Used to Read bytes directly from a File 
 */
public class FileInputStreams {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\temp\\algumArquivo.txt");
		fileInputStream.read();
		fileInputStream.read(new byte[] {1});
		fileInputStream.read(new byte[] {1}, 10, 50);
	}
	
}
