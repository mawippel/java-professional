package functionalProgramming.streams.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	/**
	 * Valid to finite streams
	 */
	private void count() {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.count();
	}

	/**
	 * Valid to finite streams
	 */
	private void minAndMax() {
		Stream<String> stream = Stream.of("laaaaaaarge, small, medium");
		Optional<String> max = stream.max((i1, i2) -> i1.length() - i2.length());
		max.ifPresent(System.out::println);
	}

	/**
	 * Valid to infinite streams
	 */
	private void findAnyAndFindFirst() {
		Stream<String> infinite = Stream.generate(() -> "New Element!");
		Stream<String> finite = Stream.of("1123", "awefawef", "344");

		Optional<String> findFirst = infinite.findFirst();
		Optional<String> findAny = finite.findAny();
	}

	/**
	 * May or may not work with infinite streams, depends on the data
	 */
	private void allMatchAnyMatchNoneMatch() {
		List<String> list = Arrays.asList("afsaf", "1pple", "pen");
		Stream<String> infinite = Stream.generate(() -> "wow");

		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.anyMatch(pred)); // true

		// PS.: Here, we can't reuse the stream, as it's a source that it's terminated
	}

	/**
	 * Valid to infinite and finite streams, but, with infinite streams, it's an
	 * infinite loop.
	 * 
	 * PS.: The only terminate operation with void return type
	 */
	private void forEach() {
		Stream<String> stream = Stream.of("apple", "pen", "pencil");
		stream.forEach(System.out::println);
	}

	/**
	 * Works like a reduce, because it transforms into another object, but here, we
	 * can return a different type. (mutable reduction)
	 */
	private void collect() {
		Stream<String> xd = Stream.of("wow man", "thats crazy", "af");
		/*
		 * Params
		 * 1. Supply some object to be used in the stream;
		 * 2. A BiConsumer, do something with two params... In this case, appends a String to another one;
		 * 3. Another BiConsumer, take two data collections and merge them through the function;
		 */
		StringBuilder collect = xd.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		
		
		// ---------- ANOTHER EXAMPLE -----------
		Stream<String> stream = Stream.of("this", "is", "inside", "a tree map");
		TreeSet<String> collect2 = stream.collect(TreeSet<String>::new, (t, u) -> t.add(u), (t, u) -> t.addAll(u));
	}
	
	private void collectWithCollectors() {
		Stream<String> stream = Stream.of("this", "is", "inside", "a tree map");
		stream.collect(Collectors.toCollection(TreeSet::new));
		
		
		Stream<String> stream2 = Stream.of("this", "is", "inside", "a tree map");
		stream2.collect(Collectors.toSet()); // In this solution, you don't know the type of Set you'll get
	}

}
