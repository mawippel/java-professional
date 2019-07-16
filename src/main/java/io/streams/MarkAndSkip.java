package io.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkAndSkip {

	public void markAndReset() throws IOException {
		InputStream fileInputStream = new FileInputStream("C:\\temp\\algumArquivo.txt");
		fileInputStream.read();
		fileInputStream.mark(100); // pass the maximum limit of bytes that can be read beforethe mark position becomes invalid
		fileInputStream.read();
		fileInputStream.read();
		fileInputStream.reset(); // When we reset, it goes back to the point of the stream where we marked it.
		fileInputStream.read();
		fileInputStream.read();
	}
	
	private static void skip() throws IOException {
		InputStream fileInputStream = new FileInputStream("C:\\temp\\algumArquivo.txt");
		fileInputStream.read();
		fileInputStream.read();
		fileInputStream.skip(12); // skips a certain number of bytes
		fileInputStream.read();
		fileInputStream.read();
	}
	
}
