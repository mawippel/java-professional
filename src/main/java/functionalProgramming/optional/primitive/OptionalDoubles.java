package functionalProgramming.optional.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalDoubles {

	public static void main(String[] args) {
		IntStream of = IntStream.of(1, 56, 77);
		OptionalDouble average = of.average();
		average.getAsDouble();
		
		average.orElseGet(() -> Double.NaN);
	}
	
}
