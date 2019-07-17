package nio2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * {@link Path} is the same of {@link File} class, but newer and better
 * 
 * Can also represent files or directories
 */
public class PathIo {

	public static void main(String[] args) throws URISyntaxException {
		/*
		 * Paths is the factory class to create a Path.
		 * 
		 */
		Path path1 = Paths.get("C:\\temp");
		Path path2 = Paths.get("C:", "temp");
		Path path4 = Paths.get(new URI("file:///C://temp")); // it's right
		// Path path3 = Paths.get(new URI("C:\\temp")); // throws Exception

		// file to path
		File file = new File("aaa");
		Path path = file.toPath();
		
		relativize();
		resolve();
		normalize();
	}

	/**
	 * Useful when you want to create paths to a specific (non-default) file system
	 */
	private void fileSystems() {
		// Paths use FileSystems class underlying
		Path path = FileSystems.getDefault().getPath("C:", "temp");
	}

	private static Path getNameAndGetNameCount() {
		Path path = Paths.get("/land/hippo/harry.happy");
		for (int i = 0; i < path.getNameCount(); i++) {
			Path name = path.getName(i);
			System.out.println(name);
		}
		return path;
	}

	private static void getFileNameGetParenGetRoot() {
		Path path = Paths.get("/land/hippo/harry.happy");
		Path fileName = path.getFileName();
		Path parent = path.getParent(); // null if there's no parent or it's a relative path
		Path root = path.getRoot();
		System.out.println(fileName + " | " + parent + " | " + root);
	}

	private static void isAbsoluteToAbsolutePath() {
		Path absolutePath = Paths.get("C:\\temp\\file.txt");
		System.out.println(absolutePath.isAbsolute()); // true
		System.out.println(absolutePath.toAbsolutePath()); // returns itself, as it's already absolute

		Path nonAbsolutePath = Paths.get("var/xd/aaa.bla");
		System.out.println(nonAbsolutePath.isAbsolute()); // false
		System.out.println(nonAbsolutePath.toAbsolutePath()); // /home/var/xd/aaa.bla
	}
	
	private void subpath() {
		Path path7 = Paths.get("/land/hippo/harry.happy");
		Path subpath = path7.subpath(0, 3); // land\hippo\harry.happy
		Path subpath2 = path7.subpath(1, 3); // hippo\harry.happy
		Path subpath3 = path7.subpath(2, 3); // harry.happy
		System.out.println(subpath);
		System.out.println(subpath2);
		System.out.println(subpath3);
	}
	
	private static void relativize() {
		// Relativizes one path to another
		Path path1 = Paths.get("/land/hippo/harry.happy");
		Path path2 = Paths.get("/land/hippo/afas.happy");
		System.out.println(path1.relativize(path2)); // ..\afas.happy
		
		Path path3 = Paths.get("/land/harry.happy");
		Path path4 = Paths.get("/land/hippo/afas.happy");
		System.out.println(path3.relativize(path4)); // ..\hippo\afas.happy
		
		/*
		 * An Exception will be thrown if:
		 * 1. If a relative path is mixed with a absolute path,
		 * 2. Two paths in differents disk drives
		 */
	}
	
	private static void resolve() {
		// Used to append a relative path into an absolute path
		Path path1 = Paths.get("/land/hippo/harry.happy");
		Path path2 = Paths.get("/land/hippo/harry.happy");
		Path resolved = path1.resolve(path2); // as both are absolute paths, the path2 is assumed
		System.out.println(resolved);
		
		Path path3 = Paths.get("/land/hippo/harry.happy");
		Path path4 = Paths.get("../hippo/harry.happy");
		Path resolved2 = path3.resolve(path4); // the first param HAS to be an absolute path
		System.out.println(resolved2);
	}
	
	private static void normalize() {
		// normalize the path into a valid one, removing unecessary stuff
		Path path3 = Paths.get("/land/hippo/harry.happy");
		Path path4 = Paths.get("../hippo/harry.happy");
		Path resolved2 = path3.resolve(path4);
		System.out.println(resolved2.normalize());
	}
	
	private void toRealPath() throws IOException {
		// Only method that actually verifies into the file system if it really exists,
		// and throws an Exception if it doesn't
		Path path = Paths.get("/land/hippo/harry.happy");
		Path realPath = path.toRealPath(); // it normalizes the path beforing checking it
	}

}
