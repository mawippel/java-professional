package designpatterns.builder;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Animal animal = new AnimalBuilder()
				.setSize(1)
				.setName("auau")
				.setFavoriteFoods(Arrays.asList("Apple", "Hamburguer", "Eggplant"))
				.build();
		
		String[] array = {"aaaa"};
	}

}
