package functionalProgramming.streams.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Here are some {@link Collectors} Examples 
 */
public class CollectorsExamples {

	private void joining() {
		Stream<String> of = Stream.of("1", "2", "56");
		of.collect(Collectors.joining());
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
		
		TreeMap<Integer, Set<String>> collect2 = of.collect(Collectors.groupingBy(e -> e.length(), TreeMap::new, Collectors.toSet()));
	}
	
	private void partitioning() {
		
	}
	
}
