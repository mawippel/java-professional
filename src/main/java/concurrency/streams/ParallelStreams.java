package concurrency.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

	private void create() {
		// Create from Stream
		Stream<String> stream = Stream.of("aaa", "bbbb", "cccc");
		Stream<String> parallelStream = stream.parallel();

		// Create from Collection[
		Collection<String> c = new ArrayList<>();
		Stream<String> parallelStream2 = c.parallelStream();
	}

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("man", "this", "is", "parallel");

		// Will print unordered
		asList.parallelStream().forEach(System.out::println);
		System.out.println("-----------------------------------------");
		// Will print using the natural order
		asList.parallelStream().forEachOrdered(System.out::println);
		System.out.println("-----------------------------------------");
		// Will print everything uppercase (unordered)
		asList.parallelStream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		// Here is a example of a lambda that produces side effects (printing). This
		// should be avoided.
		asList.parallelStream().map(e -> {
			System.out.println(e);
			return e.toUpperCase();
		}).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		findAny();
		System.out.println("-----------------------------------------");
		findFirst();
		System.out.println("-----------------------------------------");
		reduce();
	}

	private static void findAny() {
		// In parallel conditions, the findAny method takes advantage, as it results any
		// results.
		List<String> asList = Arrays.asList("man", "this", "is", "parallel");
		System.out.println(asList.parallelStream().findAny());
	}

	private static void findFirst() {
		/*
		 * FindFirst will return the first element, but, it has no advantage in using a
		 * parallelStream, as it has to synchronize it to generate a right output
		 */
		List<String> asList = Arrays.asList("man", "this", "is", "parallel");
		System.out.println(asList.parallelStream().findFirst());
		System.out.println("-----------------------------------------");
		System.out.println(asList.parallelStream().unordered().findFirst());
	}
	
	private static void reduce() {
		// With these two signatures, you may have problems, the best way is reduce using the 3-parameter signature
		System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce((a, b) -> a + b));
		System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", (a, b) -> a + b));
		
		// Best way
		System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", (a, b) -> a + b, (a, b) -> a + b));
	}
	
}
