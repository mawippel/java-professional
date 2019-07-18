package nio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Helper class like Paths, but here it's used to operate with files in Path.
 * 
 * Unlike Paths, most operations of Files will throw an Exception if the Path
 * refers to a non-valid file/path.
 */
public class FilesIo {

	public static void main(String[] args) {
		move();
	}
	
	private void exists() {
		boolean exists = Files.exists(Paths.get("C:\\temp\\file.txt")); // check if a file exists
		boolean exists2 = Files.exists(Paths.get("C:\\temp")); // check if a dir exists
	}
	
	private void isSameFile() {
		try {
			Files.isSameFile(Paths.get("C:\\temp\\file.txt"), Paths.get("C:\\temp\\file.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void createDirectory() {
		try {
			Files.createDirectory(Paths.get("C:\\temp\\")); // throw an exception if the parent dir doesn't exists
			Files.createDirectories(Paths.get("C:\\temp\\xd\\xd"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void copy() {
		try {
			Files.copy(Paths.get("C:\\temp"), Paths.get("C:\\temp\\xd")); // by default it doesn't replace if exists
			Files.copy(Paths.get("C:\\temp"), Paths.get("C:\\temp\\xd"), StandardCopyOption.REPLACE_EXISTING);
			
			// to copy the content
			FileInputStream fileInputStream = new FileInputStream("input.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
			
			Files.copy(Paths.get("C:\\destinationPath"), fileOutputStream);
			Files.copy(fileInputStream, Paths.get("C:\\sourcePath")); // support a varargs with options
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void move() {
		// move or rename a file or directory
		try {
			Files.move(Paths.get("C:\\temp"), Paths.get("C:\\xd")); // renames
			Files.move(Paths.get("C:\\temp\\xd.txt"), Paths.get("C:\\xd\\xd.txt")); // move
			
			// With options
			Files.move(Paths.get("C:\\temp\\xd.txt"), Paths.get("C:\\xd\\xd.txt"), StandardCopyOption.ATOMIC_MOVE);
			// In this case, ATOMIC_MOVE can throw an Exception if the file system doesn't support it
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void delete() {
		/*
		 * delete -> delete a file/dir if the dir is non-empty or doesn't exists;
		 * deleteIfExists -> delete a file/dir if it exists, but can throw an Exception if it fails. e.g non-empty
		 * 
		 * in symbol link cases, the symbol link is deleted, not the target file/dir
		 */
		try {
			Files.delete(Paths.get("C:\\temp"));
			Files.deleteIfExists(Paths.get("C:\\temp"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void bufferedReaderAndWriter() {
		
	}
	
}
