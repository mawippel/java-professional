package designpatterns.builder.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Animal class with a nested Builder, works the same way as the other Builder,
 * but, as the Builder is only used with the Animal class (Tight Coupling), it's
 * a better practice keeping them together.
 */
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

	public static class AnimalBuilder {

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

}