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
		
		// It doesn't update the value
		map.putIfAbsent("ele1", "kkk");
		
		// Updates the value, because it was a null value
		map.putIfAbsent("ele3", "jjj");
		
		System.out.println(map);
	}
	
}
