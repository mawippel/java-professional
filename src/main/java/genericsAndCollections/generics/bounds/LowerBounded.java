package genericsAndCollections.generics.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Lowerbounded are mutable
 */
public class LowerBounded {

	private void addSound(List<? super String> list) {
		list.add("This is mutable!");
		list.add(""); // THIS IS MUTABLE, BUT YOU CAN ADD ONLY STRINGS
	}

	public void main() {
		List<String> strings = new ArrayList<>();
		strings.add("aaa");
		List<Object> objects = new ArrayList<>(strings);
		addSound(strings);
		addSound(objects);
	}

	public void testname() throws Exception {
		List<? super IOException> exceptions = new ArrayList<Exception>();
		// exceptions.add(new Exception()); This does not compile, cause we could have an Exception object in there, and it wouldnt fit the List
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
	}
}
