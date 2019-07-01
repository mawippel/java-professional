package genericsAndCollections.generics.classes;

/**
 * Naming conventions for Generic Classes:
 * 
 * E -> Elements
 * K -> Maps keys
 * V -> Maps values
 * N -> Number
 * T -> Generic data type
 * S, U, V... -> Multiple generic data types
 */
public class BasicClassExample<T> {
	
	private T contents;
	
	public T emptyCrate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}

}
