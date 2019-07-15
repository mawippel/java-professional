package concurrency.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		System.out.println(map);
	}
	
}
