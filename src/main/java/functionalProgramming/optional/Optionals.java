package functionalProgramming.optional;

import java.util.Optional;

/**
 * Used to represent a value that can be null.
 */
public class Optionals {

	public static void main(String[] args) {
		Optional<String> randomName = randomName();
		System.out.println(randomName.orElse("didn't found"));
		System.out.println(randomName.orElseGet(() -> "didn't found (inside supplier)"));
		System.out.println(randomName.orElseThrow(() -> new RuntimeException()));
	}
	
	private static Optional<String> randomName(){
		return Optional.of("aa");
	}
	
}
