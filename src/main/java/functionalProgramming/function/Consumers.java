package functionalProgramming.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Used when you want to do something with a parameter, and result nothing.
 * 
 * BiConsumer is the same, just consumes two params
 */
public class Consumers {

	public static void main(String[] args) {
		Consumer<String> s1 = a -> System.out.println(a);
		Consumer<String> s2 = System.out::println;
		
		s1.accept("wow");
		s2.accept("hehehe");
		
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> bc1 = (k, v) ->  map.put("aaa", 123);
		BiConsumer<String, Integer> bc2 = map::put;
		
		bc1.accept("wow", 77);
		bc2.accept("gage", 655);
	}
	
}
