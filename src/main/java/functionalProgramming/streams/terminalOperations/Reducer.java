package functionalProgramming.streams.terminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Put outside of the {@link Streams} class because it has more examples 
 */
public class Reducer {

	/**
	 * This method concatenates all the positions of the stream into a single String 
	 */
	private void reduce_1() {
		Stream<String> xd = Stream.of("wow man", "thats crazy", "af");
		// Returns an optional, because no identity is provided
		Optional<String> reduce = xd.reduce(String::concat);
	}
	
	/**
	 * This method concatenates all the positions of the stream into a single String.
	 * 
	 * PS.: If the stream is empty, it returns the identity value
	 */
	private void reduce_2() {
		Stream<String> xd = Stream.of("wow man", "thats crazy", "af");
		// Returns a String, because an identity is provided
		String reduce = xd.reduce("nope", String::concat);
	}
	
	/**
	 * USED ONLY WHEN PROCESSING COLLECTIONS IN PARALLEL.
	 * One parameter is used to intermediate reductions, and then combine at the end. 
	 */
	private void reduce_3() {
		Stream<Integer> xd = Stream.of(1, 6, 7, 89);
		Integer reduce = xd.reduce(0, Integer::sum, Integer::sum);
	}
	
}
