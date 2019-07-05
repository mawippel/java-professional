package methodreference.instancemethods.runtime;

import java.util.function.Predicate;

public class Main {

	/**
	 * It looks like a static method, but it isn't, Java knows that isEmpty does not take
	 * any parameters, so, it uses the method to provide the instance to call the method.
	 * Here, we DON'T know the instance. 
	 */
	public static void main(String[] args) {
		Predicate<String> ref1 = String::isEmpty;
		Predicate<String> ref2 = s -> s.isEmpty();
	}
	
}
