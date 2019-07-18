package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Used to read/update more than one file attribute at one time.
 */
public class FileAttributesViews {

	private void basicFileAttributes() {
		try {
			// return a read-only version of the attributes
			BasicFileAttributes readAttributes = Files.readAttributes(Paths.get("C:\\temp"), BasicFileAttributes.class);
			
			/*
			 * has the same methods as Files, here are the new ones:
			 */
			boolean other = readAttributes.isOther(); // other type of file that is not a dir, file, link...etc
			FileTime lastAccessTime = readAttributes.lastAccessTime();
			FileTime creationTime = readAttributes.creationTime();
			Object fileKey = readAttributes.fileKey(); // returns a unique key for the file in the file system (if supported)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void fileAttributeView() {
		// returns a object that contains updatable attributes
		BasicFileAttributeView view = Files.getFileAttributeView(Paths.get(""), BasicFileAttributeView.class);
		try {
			BasicFileAttributes data = view.readAttributes();
			view.setTimes(null, null, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
