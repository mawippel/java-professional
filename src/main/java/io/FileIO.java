package io;

import java.io.File;

/**
 * Can be a file or a directory reference.
 * It doesn't store values, only a 'reference' to a file or dir. 
 */
public class FileIO {

	public static void main(String[] args) {
		File file = new File("C:\\temp");
		System.out.println(file.exists());
		
		File doesntExists = new File("C:\\temp\\xdxd");
		System.out.println(doesntExists.exists());
	}
	
	private void usefulMethods() {
		File file = new File("C:\\temp");
		
		file.exists();
		file.isDirectory();
		file.getAbsolutePath();
		file.isFile();
		file.mkdir();
		file.mkdirs();
		file.listFiles();
		file.lastModified();
	}
	
}
