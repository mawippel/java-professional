package functionalProgramming.streams.terminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Here are some {@link Collectors} Examples 
 */
public class CollectorsExamples {

	private void joining() {
		Stream<String> of = Stream.of("1", "2", "56");
		String collect = of.collect(Collectors.joining());
	}
	
	private void averagingInt() {
		Stream<Integer> of = Stream.of(1, 56, 88);
		Double collect = of.collect(Collectors.averagingInt(e -> e));
	}
	
	private void toMap() {
		Stream<String> of = Stream.of("1", "2", "56");
		of.collect(Collectors.toMap(Function.identity(), s -> s.length()));
		
		Stream<String> of2 = Stream.of("1", "2", "56");
		of2.collect(Collectors.toMap(Function.identity(), s -> s.length(), (s1, s2) -> s1 + s2));
		
		Stream<String> of3 = Stream.of("1", "2", "56");
		of3.collect(Collectors.toMap(Function.identity(), s -> s.length(), (s1, s2) -> s1 + s2, TreeMap::new));
	}
	
	private void groupingBy() {
		Stream<String> of = Stream.of("1", "2", "56");
		Map<Integer, List<String>> collect = of.collect(Collectors.groupingBy(e -> e.length()));
		
		Map<Integer, Set<String>> collect3 = of.collect(Collectors.groupingBy(e -> e.length(), Collectors.toSet()));
		Map<Integer, Long> collect4 = of.collect(Collectors.groupingBy(e -> e.length(), Collectors.counting()));
		
		TreeMap<Integer, Set<String>> collect2 = of.collect(Collectors.groupingBy(e -> e.length(), TreeMap::new, Collectors.toSet()));
	}
	
	/**
	 * It's like splitting a list into two sizes. Receives a boolean
	 */
	private void partitioning() {
		Stream<String> of = Stream.of("lion", "beeeear", "cat");
		// it will build a map with true and false, and the values inside a List
		Map<Boolean, List<String>> collect = of.collect(Collectors.partitioningBy(b -> b.length() >= 5));
		
		Map<Boolean, Set<String>> collect2 = of.collect(Collectors.partitioningBy(b -> b.length() >= 5, Collectors.toSet()));
		
		// Here, we can't change the type of map that we're using, because it doesnt make sense, we only have two keys in the map
	}
	
	private void mapping() {
		Stream<String> of = Stream.of("lion", "beeeear", "cat");
		// Group by the length of the words, and then, put in the value the first char of the String, 
		Map<Integer, Optional<Character>> collect = of.collect(Collectors.groupingBy(s -> s.length(),
				Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))
				));
	}
	
}
