package designpatterns.polymorphism;

public class Main {

	public static void main(String[] args) {
		// Duck d = new Animal(); // DOES NOT COMPILE
		// Dog dog = new Duck(); // DOES NOT COMPILE
		
		Animal dog = new Dog();
		Animal duck = new Duck();
		dog = duck;
		duck = dog; // Can be done, becase both are animals.
		
		Dog dog1 = new Dog();
		Animal animal = new Duck();
		// dog1 = (Dog) animal; // Compiles, but throws a ClassCastException, because a Duck can't be casted to a Dog.
		animal = dog1; // Can be done, animal can receive a dog
		// dog1 = animal; // DOES NOT COMPILE, a Dog can't receive an Animal
		
		Animal pinscher = new Dog();
		Dog golden = (Dog) pinscher;
		
		Animal a = new Animal();
		Dog dog3 = new Dog();
		// a = dog3; // a is now poiting to a Dog reference, but only accessing what's visible in the Animal class
		// dog3 = (Dog) a; // DOES NOT COMPILE
		a = (Animal) dog3; // Can be done, a class can always can be casted to the supertype
	}

}
