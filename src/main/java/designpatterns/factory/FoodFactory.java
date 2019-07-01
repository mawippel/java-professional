package designpatterns.factory;

/**
 * Factory classes are OFTEN implemented with static methods that returns objects.
 */
public class FoodFactory {

	public static Food getFood(String animalName) {
		switch (animalName) {
		case "zebra":
			return new Hay(100);
		case "rabbit":
			return new Pellets(5);
		case "goat":
			return new Pellets(30);
		case "polar bear":
			return new Fish(25);
		}
		
		// Good practice to throw an exception if no match was found
		throw new UnsupportedOperationException("No food was found for that animal!");
	}

}
