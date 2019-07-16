package io.streams.classes.highLevel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreams {

	public static void main(String[] args) throws IOException {
		InputStream outputStream = new BufferedInputStream(new FileInputStream("C:\\temp\\algumArquivo.txt"));
		byte[] buffer = new byte[1024];
		
		outputStream.read();
		outputStream.read(buffer);
		outputStream.read(new byte[] {1}, 10, 50);
	}
	
}
