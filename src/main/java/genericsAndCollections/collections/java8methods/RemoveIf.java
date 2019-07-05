package genericsAndCollections.collections.java8methods;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
	
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		
		animals.removeIf(a -> a.startsWith("Li"));
	}
	
}
