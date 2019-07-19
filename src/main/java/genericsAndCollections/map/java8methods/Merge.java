package genericsAndCollections.map.java8methods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Merge {

	public static void main(String[] args) {

		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		favorites.put("NullValue", null);

		// Leaves the value as it is
		favorites.merge("Jenny", "Skyride", mapper);

		// Change the favorite Tom's movie to Skyride
		favorites.merge("Tom", "Skyride", mapper);

		/*
		 * In this case, it skips the mapper function, as the map value is null, it
		 * simply uses the provided value
		 */
		favorites.merge("NullValue", "hhh", mapper);
		
		
		favorites.clear();
		
		BiFunction<String, String, String> nullMapper = (v1, v2) -> null;
		
		favorites.put("ele1", "awefawe");
		favorites.put("ele2", "awefawe");
		
		// When null is returned from the mapped, the key is removed from the map
		favorites.merge("ele1", "eee", nullMapper);
		// In this case the element is added, as there wasn't any 'newEle' key
		favorites.merge("newEle", "aaa", nullMapper);
		
		System.out.println(favorites);
	}

}
