package concurrency.collections;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySets {

	/**
	 * Same thing as a CopyOnWriteArrayList, but here, it's a Set.
	 */
	public static void main(String[] args) {
		Set<String> list = new CopyOnWriteArraySet<>();
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
