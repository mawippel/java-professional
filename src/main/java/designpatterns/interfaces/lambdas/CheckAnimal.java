package designpatterns.interfaces.lambdas;

/**
 * A functional interface containing a method that receives an Animal and can
 * execute any method inside it
 */
@FunctionalInterface
public interface CheckAnimal {

	boolean test(Animal a);

}
