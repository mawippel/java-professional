package genericsAndCollections.generics.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Unbounded and Upperbounded variabled are immutable 
 */
public class UnboundedAndUpperbounded {

	public void testingBounds() {
		// List<Object> x = new ArrayList<String>; // It's not possible
	}

	/**
	 * This methods takes any type of List as a parameter, and under the carpet,
	 * it's treated as an Object
	 */
	public void printList(List<?> list) { // UNBOUNDED WILDCARD
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public void printNumberList(List<? extends Number> anyNumber) { // UPPERBOUND WILDCARD
		for (Number number : anyNumber) {
			System.out.println(number);
		}
	}

	/**
	 * When working with upperbounds or unbounded wildcard, the variable turns into
	 * logically immutable, as Java don't know what will it receive.
	 */
	public void thisWontWork() {
		List<? extends Number> xd = new ArrayList<Integer>();
		
		// xd.add(Integer.valueOf(123)); // IT DOES NOT COMPILE!
	}
	

}
