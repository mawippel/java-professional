package functionalProgramming.streams.primitive;

import java.util.stream.IntStream;

/**
 * Used for: int, short, byte, char
 */
public class IntStreams {

	public static void main(String[] args) {
		IntStream of = IntStream.of(1);
		IntStream of2 = IntStream.of(1, 3, 7, 9);

		of.forEach(System.out::println);
		of2.forEach(System.out::println);
	}

	private void range() {
		IntStream of = IntStream.range(1, 7);
		// prints 1 - 6
		of.forEach(System.out::println);
	}

	private void rangeClosed() {
		IntStream of = IntStream.rangeClosed(1, 6);
		// prints 1 - 6
		of.forEach(System.out::println);
	}

}
