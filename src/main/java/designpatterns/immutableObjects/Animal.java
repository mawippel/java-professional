package designpatterns.immutableObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 5 RULES OF IMMUTABLE CLASSES
 * 
 * 1. Use a constructor to set all properties of the object;
 * 2. Mark all of the instance variables private and final;
 * 3. Don't define any setter methods;
 * 4. Don't allow referenced mutable objects to be modified or accessed directly;
 * 5. Prevent methods from being overridden;
 * 
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
	
	// THIS CAN'T BE DONE, AS IT TURNS THE OBJECT MUTABLE
//	public List<String> getFavoriteFoods() {
//		return favoriteFoods;
//	}

}
