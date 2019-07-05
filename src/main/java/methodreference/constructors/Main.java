package methodreference.constructors;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {

	/**
	 * A Supplier is used here, as it doesn't take any parameter, and doesn't return
	 * anything, it just executes the code provided.
	 */
	public static void main(String[] args) {
		Supplier<ArrayList> ref1 = ArrayList::new;
		Supplier<ArrayList> ref2 = () -> new ArrayList();
	}

}
