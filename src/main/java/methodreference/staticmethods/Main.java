package methodreference.staticmethods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	/**
	 * Both works like the same. Java here knows that a Consumer takes only one
	 * parameter, so it calls the sort method with only one parameter
	 */
	public static void main(String[] args) {
		Consumer<List<Integer>> ref1 = Collections::sort;
		Consumer<List<Integer>> ref2 = l -> Collections.sort(l);
	}
	
}
