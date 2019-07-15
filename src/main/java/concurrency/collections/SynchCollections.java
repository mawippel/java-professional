package concurrency.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SynchCollections {

	public static void main(String[] args) {
		/**
		 * Turn a Collection/Map/Set into a synchronized Collection/Map/Set.
		 * 
		 * PS.: its IMPERATIVE that you use a synchronized block when you need to
		 * iterate, because here, it'll throw a ConcurrentModificationException, unlike
		 * the Concurrent Collections.
		 */

		Collections.synchronizedCollection(new ArrayList<>());
		Collections.synchronizedList(new ArrayList<>());
		Collections.synchronizedSet(new HashSet<>());
		Collections.synchronizedMap(new HashMap<>());
		Collections.synchronizedNavigableMap(new TreeMap<>());
		Collections.synchronizedNavigableSet(new TreeSet<>());
		Collections.synchronizedSortedMap(new TreeMap<>());
		Collections.synchronizedSortedSet(new TreeSet<>());
	}

}
