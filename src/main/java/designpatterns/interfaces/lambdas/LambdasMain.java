package designpatterns.interfaces.lambdas;

public class LambdasMain {

	private static void print(Animal a, CheckAnimal check) {
		if (check.test(a)) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		print(new Animal("a", true, true), b -> b.canSwim());
		print(new Animal("a", true, true), b -> b.canHop());
	}
}
