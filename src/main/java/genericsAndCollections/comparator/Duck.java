package genericsAndCollections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Used as a Comparator for an object.
 */
public class Duck implements Comparable<Duck> {

	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	/**
	 * 0 -> the objects are equal < 0 -> 'this' is smaller than the argument passed
	 * > 0 -> 'this' is bigger than the argument passed
	 */
	@Override
	public int compareTo(Duck o) {

		// for ints (asc)
		int b = this.id - o.getId();

		// for ints (desc)
		b = o.getId() - this.id;

		// for strings
		name.compareTo(o.getName());

		return 0;
	}
	
	public static void main(String[] args) {
		Comparator<Duck> c = (o1, o2) -> o1.getId() - o2.getId();
		List<Duck> d = new ArrayList<>();
		d.add(new Duck());
		d.add(new Duck());
		d.add(new Duck());
		Collections.sort(d, c);
	}

}
