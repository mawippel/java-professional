package genericsAndCollections.map.java8methods;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ele1", "aaa");
		map.put("ele2", "bbb");
		map.put("ele3", null);
		
		// This updates the value
		map.put("ele1", "abc");
		
		// This updates the value too
		map.putIfAbsent("ele1", "kkk");
		
		// Adds the value as well, because it was a null value
		map.putIfAbsent("ele3", "jjj");
	}
	
}
