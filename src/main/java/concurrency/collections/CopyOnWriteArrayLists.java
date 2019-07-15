package concurrency.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * With CopyOnWrite collections, everytime an element is added/modified/removed
 * a new copy of the List is made to the underlying List.
 */
public class CopyOnWriteArrayLists {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
			// This won't throw an ConcurrentModificationException, but if it was a normal
			// ArrayList, it would.
			list.add("added after");
		}
		System.out.println(list);
	}

}
