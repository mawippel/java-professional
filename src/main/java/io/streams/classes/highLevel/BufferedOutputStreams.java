package io.streams.classes.highLevel;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreams {

	public static void main(String[] args) throws IOException {
		OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\temp\\algumArquivo.txt"));
		byte[] buffer = new byte[1024];
		
		outputStream.write(1);
		outputStream.write(buffer); // pretty much equal as the FileOutputStream, but here it's optimized
		outputStream.write(new byte[] {1}, 10, 50);
	}
	
}
