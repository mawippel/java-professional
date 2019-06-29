package designpatterns.builder;

import java.util.List;

public class AnimalBuilder {

	private int size;
	private String name;
	private List<String> favoriteFoods;

	public AnimalBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public AnimalBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public Animal build() {
		return new Animal(size, name, favoriteFoods);
	}

}
