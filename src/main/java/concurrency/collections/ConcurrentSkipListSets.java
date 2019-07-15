package concurrency.collections;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * A concurrent version of a Sorted Set (TreeSet)
 */
public class ConcurrentSkipListSets {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new ConcurrentSkipListSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);

		set.lower(1);
		set.floor(1);
		set.ceiling(1);
		set.higher(1);
	}

}
