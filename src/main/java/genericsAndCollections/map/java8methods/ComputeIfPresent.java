package genericsAndCollections.map.java8methods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIfPresent {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ele1", 1);
		map.put("ele2", null);
		
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		// runs the mapper
		map.computeIfPresent("ele1", mapper);
		// doesn't run the mapper
		map.computeIfPresent("ele2", mapper);
		// doesn't run the mapper		
		map.computeIfPresent("ele3", mapper);
		
		System.out.println(map);
		
		BiFunction<String, Integer, Integer> mapper2 = (k, v) -> null;
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("ele1", 1);
		map2.put("ele2", null);
		
		// remove the element
		map2.computeIfPresent("ele1", mapper2);
		
		// does nothing
		map2.computeIfPresent("ele2", mapper2);
		
		// does nothing
		map2.computeIfPresent("ele3", mapper2);
		System.out.println(map2);
	}
	
}
