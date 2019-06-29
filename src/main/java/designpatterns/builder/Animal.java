package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Animal {

	private final int size;
	private final String name;
	private final List<String> favoriteFoods;

	public Animal(int size, String name, List<String> favoriteFoods) {
		this.size = size;
		this.name = name;

		Objects.requireNonNull(favoriteFoods, "Can't be null");
		this.favoriteFoods = new ArrayList<>(favoriteFoods);
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}

}