package concurrency.collections;

import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * A concurrent version of a Sorted Map (TreeMap) 
 */
public class ConcurrentSkipListMaps {

	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		System.out.println(map);
		
		map.lowerEntry(1);
		map.floorEntry(1);
		map.ceilingEntry(1);
		map.higherEntry(1);
	}
	
}
