package genericsAndCollections.map.java8methods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputeIfAbsent {

	/**
	 * A {@link Function} receive the first type as a value, and returns the second type
	 * @param args
	 */
	public static void main(String[] args) {
		Function<String, Integer> mapper = (k) -> 1;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("ele1", 1);
		map.put("ele2", null);
		
		// Does nothing
		map.computeIfAbsent("ele1", mapper);
		
		// Puts 1 in the value
		map.computeIfAbsent("ele2", mapper);
		
		// Adds 3 in the map, with value 1
		map.computeIfAbsent("ele3", mapper);
		
		
		Function<String, Integer> mapper2 = (k) -> null;
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("ele1", 1);
		map2.put("ele2", null);
		
		// does nothing
		map2.computeIfAbsent("ele1", mapper2);
		
		// does nothing
		map2.computeIfAbsent("ele2", mapper2);
		
		// doesn't add the value
		map2.computeIfAbsent("ele3", mapper2);
		System.out.println(map2);
	}
	
}
