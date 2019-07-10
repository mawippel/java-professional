package functionalProgramming.optional.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalInts {

	public static void main(String[] args) {
		IntStream of = IntStream.of(1, 56, 77);
		OptionalDouble average = of.average();
		average.getAsDouble();
		
		average.orElseGet(() -> Integer.MIN_VALUE);
	}
	
}
