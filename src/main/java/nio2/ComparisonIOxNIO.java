package nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class ComparisonIOxNIO {

	private void legacy() {
		File file = new File("C:\\temp");
		file.exists();
		file.getName();
		file.getAbsoluteFile();
		file.isDirectory();
		file.isFile();
		file.isHidden();
		file.length();
		file.lastModified();
		file.setLastModified(123);
		file.delete();
		file.renameTo(new File(""));
		file.mkdir();
		file.mkdirs();
		file.listFiles();
	}
	
	private void nio() throws IOException {
		Path path = Paths.get("C:\\temp");
		Files.exists(path);
		path.getFileName();
		path.toAbsolutePath();
		Files.isDirectory(path);
		Files.isRegularFile(path);
		Files.isHidden(path);
		Files.size(path);
		Files.getLastModifiedTime(path);
		Files.setLastModifiedTime(path, FileTime.fromMillis(123123L));
		Files.delete(path);
		Files.move(path, Paths.get("aaa"));
		Files.createDirectory(path);
		Files.createDirectories(path);
		Files.list(path); // or Files.walk()
	}
	
}
