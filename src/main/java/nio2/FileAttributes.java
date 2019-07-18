package nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

/** 
 * Used to read file/dir attributes, via {@link Files} class
 */
public class FileAttributes {
	
	private void isDirectory() {
		boolean directory = Files.isDirectory(Paths.get("C:\\temp")); // can be true if it's a symbolic link pointing to a directory
	}
	
	private void isRegularFile() {
		boolean regularFile = Files.isRegularFile(Paths.get("C:\\temp")); // can be true if it's a symbolic link pointing to a regular file
	}
	
	private void isSymbolicLink() {
		boolean symbolicLink = Files.isSymbolicLink(Paths.get("C:\\temp"));
	}
	
	private void isHidden() {
		try {
			boolean hidden = Files.isHidden(Paths.get("C:\\temp"));
		} catch (IOException e) { // if and i/o exception ocurr
			e.printStackTrace();
		}
	}
	
	private void isReadable() {
		boolean readable = Files.isReadable(Paths.get("C:\\temp"));
	}
	
	private void isExecutable() {
		boolean executable = Files.isExecutable(Paths.get("C:\\temp"));
	}
	
	private void size() {
		try {
			long size = Files.size(Paths.get("C:\\temp")); // number of bytes
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void modifiedTime() {
		try {
			FileTime lastModifiedTime = Files.getLastModifiedTime(Paths.get("C:\\temp"));
			Files.setLastModifiedTime(Paths.get("C:\\temp"), lastModifiedTime);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void owner() {
		try {
			UserPrincipal owner = Files.getOwner(Paths.get("C:\\temp"));
			Path setOwner = Files.setOwner(Paths.get("C:\\temp"), owner);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Using UserPrincipalLookupService
		try {
			UserPrincipal lookupPrincipalByName = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("mawippel");
			Files.setOwner(Paths.get("C:\\temp"), lookupPrincipalByName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
