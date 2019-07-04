package genericsAndCollections.comparable;

/**
 * Used for data structures that require comparison.
 * 
 * This means that a bean is "Comparable" to another one of the same type as
 * this.
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
	 * 0 -> the objects are equal
	 * < 0 -> 'this' is smaller than the argument passed
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

}
