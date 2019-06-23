package designpatterns.interfaces.lambdas;

import java.util.function.Predicate;

public class LambdasMain {

	private static void print(Animal a, Predicate<Animal> check) {
		if (check.test(a)) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		print(new Animal("a", true, true), b -> b.canSwim());
		print(new Animal("a", true, true), b -> {
			return b.canSwim();
		});
		print(new Animal("a", true, true), (Animal b) -> {
			return b.canSwim();
		});
		print(new Animal("a", true, true), b -> true);
	}
}
