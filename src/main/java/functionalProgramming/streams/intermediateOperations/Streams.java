package functionalProgramming.streams.intermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	private void filter() {
		Stream<Integer> xd = Stream.of(1, 6, 7, 89);
		xd.filter(i -> i > 10).forEach(System.out::println);
	}

	private void distinct() {
		Stream<String> xd = Stream.of("xd", "xd", "aaa");
		xd.distinct().forEach(System.out::println);
	}

	private void skipAndLimit() {
		Stream<Integer> iterate = Stream.iterate(1, i -> i + 1); // infinite stream
		iterate.skip(5).limit(2).forEach(System.out::println);
		// skips the 5 first elements, get the next 2 elements
	}
	
	private void map() {
		Stream<String> xd = Stream.of("xd", "xd", "aaa");
		xd.map(String::length).forEach(System.out::println);
	}
	
	private void flatMap() {
		List<String> list1 = Arrays.asList();
		List<String> list2 = Arrays.asList("ohyes", "ohno");
		List<String> list3 = Arrays.asList("ss", "nn", "ff");
		
		Stream<List<String>> of = Stream.of(list1, list2, list3);
		
		of.flatMap(l -> l.stream()).forEach(System.out::println);
	}
	
	private void sorted() {
		Stream<String> xd = Stream.of("xd", "xd", "aaa");
		// It uses the natural ordering (Comparable), or providing a Comparator
		xd.sorted().forEach(System.out::println);
		
		xd.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	/**
	 * Good for debugging stuff.
	 * Perform a stream operation without changing it.
	 */
	private void peek() {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		List<Character> letters = Arrays.asList('a', 'b', 'c');
		
		// Bad way
		Stream<List<?>> stream = Stream.of(numbers, letters);
		stream.map(l -> l.size()).forEach(System.out::print);
		// Good way
		Stream<List<?>> stream2 = Stream.of(numbers, letters);
		stream2.peek(System.out::print) // Print each list
				.map(List::size) // Transform into a list of sizes
				.forEach(System.out::print); // Print each size
	}
	
}
