package nio2;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Streams {

	private void walk() {
		try {
			// can take a varargs
			Stream<Path> walk = Files.walk(Paths.get("")); // it's lazy loaded
			walk.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
			
			// there's also a walk version that takes de depth
			Stream<Path> walk2 = Files.walk(Paths.get(""), 5); // can take a varargs
			
			// It has also a varargs with options version
			Files.walk(Paths.get(""), FileVisitOption.FOLLOW_LINKS); // may cause a FileSystemLoopException
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void find() {
		try {
			// Takes a BiPredicate with the Path and the BasicFileAttributes, returns a Stream
			Stream<Path> find = Files.find(Paths.get(""), 10, // This is good that the depth is always required
					(p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > 12312312L);
			find.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void list() {
		/*
		 * List the files of a directory, it's like using walk with() a depth of 1
		 * 
		 * The same of File.listFiles()
		 */
		try {
			Stream<Path> list = Files.list(Paths.get(""));
			list.filter(p -> !Files.isDirectory(p))
				.map(Path::toAbsolutePath)
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void lines() {
		// Equivalent to Files.readAllLines()
		// Lazily loads the content of the file, that's why it can't throw a memory exception
		try {
			Stream<String> lines = Files.lines(Paths.get(""));
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
